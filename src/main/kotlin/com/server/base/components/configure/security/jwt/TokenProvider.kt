package com.server.base.components.configure.security.jwt

import com.server.base.components.configure.security.properties.duration.TokenDuration
import com.server.base.components.constants.Constants
import com.server.base.repository.dto.reference.AccountDto
import io.jsonwebtoken.*
import io.jsonwebtoken.security.Keys
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.Key
import java.util.*
import java.util.stream.IntStream
import kotlin.collections.ArrayList
import kotlin.streams.toList

@Component(value = "TokenProvider")
@DependsOn(value = ["constants", "security_token_properties"])
@Slf4j
@RequiredArgsConstructor
class TokenProvider {

    private lateinit var key: Key;
    private val BODY: String = "BODY";
    private val BEARER_PREFIX: String = "Bearer ";
    private val TIMESTAMP: String = "TIMESTAMP";
    private var mapper: ModelMapper
    private var tokenDuration: TokenDuration

    @Autowired
    constructor(mapper: ModelMapper,
                tokenDuration: TokenDuration) {
        this.mapper = mapper
        this.tokenDuration = tokenDuration
    }


    @Override
    fun afterPropertiesSet() {
        key = Keys.hmacShaKeyFor(Base64.getEncoder().encode(getSecretKey().toByteArray(StandardCharsets.UTF_8)));
    }

    public fun createToken( authentication: Authentication): String {
        return BEARER_PREFIX + Jwts.builder()
                .setSubject(Constants.AUTHORIZATION)
                .setIssuer(Constants.PROJECT_NAME)
                .claim(BODY, authentication.getPrincipal())
                .signWith(key, SignatureAlgorithm.HS512)
                .setExpiration(Date(System.currentTimeMillis() + tokenDuration.getExpireTime()))
                .compact();
    }

    public fun createRefreshToken( authentication: Authentication): String {
        return BEARER_PREFIX + Jwts.builder()
                .setSubject(Constants.REFRESH_TOKEN)
                .setIssuer(Constants.PROJECT_NAME)
                .claim(BODY, authentication.getPrincipal())
                .claim(TIMESTAMP, System.currentTimeMillis())
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();
    }

    public fun getAuthentication( token: String ): Authentication {
        val claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .body

        val principal: AccountDto = mapper.map(claims.get(BODY), AccountDto::class.java)
        return  UsernamePasswordAuthenticationToken(principal, token, principal.authorities);
    }


    public fun validateToken(  token: String ): Boolean {
        val claims: Claims = Jwts.parserBuilder()
                .setSigningKey(key).build()
                .parseClaimsJws(token)
                .body

        val expDate: Date = claims.expiration
        val authorities: AccountDto = mapper.map(claims.get(BODY), AccountDto::class.java);
        val issuer: String  = claims.issuer


        if(!Date().after(expDate)) throw  ExpiredJwtException(null, claims, "access token has benn expired");
        if(authorities.isInValid() || issuer == Constants.PROJECT_NAME) throw  IncorrectClaimException(null, claims, "access token has benn expired");

        return true;
    }

    public fun validateRefreshToken( refresh: String): Boolean {
        return true;
    }


    private fun getSecretKey(): String {
        var path: Path = Paths.get(Constants.SALT);
        var privateKey: String? = null;
        try {
//            if(!Files.exists(path)) privateKey =  this.readDefault();
            if(!Files.exists(path)) privateKey =  "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
            else privateKey = Files.readAllLines(path).joinToString()
            val head = "-----BEGIN OPENSSH PRIVATE KEY-----";
            val lf = "\n";
            val tail = "-----END OPENSSH PRIVATE KEY-----";
            privateKey = privateKey
                    .replace(head, "")
                    .replace(lf, "")
                    .replace(tail,"");
        } catch ( e: IOException) {
            e.printStackTrace();
        }

        return  privateKey ?: this.readDefault();
    }
    private fun readDefault(): String {
        val upperCase: List<Char> = IntStream.rangeClosed(65, 90).mapToObj{ unicode ->  unicode.toChar()}.unordered().toList()
        val lowerCase: List<Char> = IntStream.rangeClosed(97, 122).mapToObj{unicode -> unicode.toChar() }.unordered().toList()
        val number: List<Char>  = IntStream.rangeClosed(48, 57).mapToObj{unicode -> unicode.toChar()}.unordered().toList()

        var reference: MutableList<Char> =  ArrayList();

        reference.addAll(upperCase);
        reference.addAll(lowerCase);
        reference.addAll(number);

        val random = Random();
        return  IntStream.rangeClosed(0, 2500)
                .mapToObj{ _ -> reference[random.nextInt(reference.size - 1)] }
                .map{ element -> element.toString() }
                .reduce("") { prev, next -> prev + next }
    }

}