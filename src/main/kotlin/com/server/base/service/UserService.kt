package com.server.base.service

import com.server.base.components.base.BaseService
import com.server.base.components.configure.security.jwt.TokenProvider
import com.server.base.components.constants.Constants
import com.server.base.components.expcetions.BecauseOf
import com.server.base.components.expcetions.CommonException
import com.server.base.repository.domain.Account
import com.server.base.repository.dto.reference.AccountDto
import com.server.base.repository.dto.request.SignInRequest
import com.server.base.repository.dto.request.SignUpRequest
import com.server.base.repository.userRepository.UserRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import java.util.function.Supplier
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@Service
@Slf4j
@Transactional(rollbackFor = [Exception::class])
class UserService(): BaseService(), UserDetailsService {

    @Autowired
    private lateinit var tokenProvider: TokenProvider;
    @Autowired
    private lateinit var repository: UserRepository;

    override fun loadUserByUsername(username: String?): UserDetails {
        val signInRequest: SignInRequest =  SignInRequest();
        signInRequest.userId = username;
        return repository.signIn(signInRequest).orElseThrow{ UsernameNotFoundException(username) };
    }

    fun refreshAccessToken(signInRequest: SignInRequest, response: HttpServletResponse?): AccountDto {
        val dto = repository.signIn(signInRequest).orElseThrow{ CommonException(BecauseOf.ACCOUNT_NOT_EXIST) }

        val authentication: Authentication = UsernamePasswordAuthenticationToken(dto, null)
        val token = tokenProvider.createToken(authentication)

        response!!.addHeader(Constants.AUTHORIZATION, token)
        return dto
    }

    fun signIn(signInRequest: SignInRequest?, response: HttpServletResponse?): AccountDto {

        val dto = repository.signIn(signInRequest).orElseThrow { CommonException(BecauseOf.ACCOUNT_NOT_EXIST) }

        if (!isPasswordMatched(signInRequest!!.userPwd, dto.userPwd)!!) throw CommonException(BecauseOf.PASSWORD_NOT_MATCHED)
        val authentication: Authentication = UsernamePasswordAuthenticationToken(dto, null)
        val token = tokenProvider.createToken(authentication)

        response!!.addHeader(Constants.AUTHORIZATION, token)
        response!!.addHeader(Constants.REFRESH_TOKEN, dto.refreshToken)

        return dto
    }

    fun signUp(signUpRequest: @Valid SignUpRequest?, response: HttpServletResponse?): AccountDto {
        if (Objects.nonNull(signUpRequest!!.userNo)) throw CommonException(BecauseOf.ALREADY_EXIST_ACCOUNT)


        var dto: AccountDto = signUpRequest!!
        encryptPassword(dto)

        val authentication: Authentication = UsernamePasswordAuthenticationToken(dto, null)
        val accessToken = tokenProvider.createToken(authentication)
        val refreshToken = tokenProvider.createRefreshToken(authentication)

        dto.refreshToken = refreshToken
        val account: Account = repository.save(mapper.map(dto, Account::class.java))
        dto = mapper.map(account, AccountDto::class.java)

        response!!.addHeader(Constants.AUTHORIZATION, accessToken)
        response!!.addHeader(Constants.REFRESH_TOKEN, refreshToken)
        return dto
    }



}