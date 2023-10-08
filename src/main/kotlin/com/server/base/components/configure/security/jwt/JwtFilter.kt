package com.server.base.components.configure.security.jwt

import com.server.base.components.constants.Constants
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import org.springframework.util.StringUtils
import org.springframework.web.filter.GenericFilterBean
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

@Component(value = "JwtFilter")
@DependsOn(value = ["constants", "TokenProvider"])
@RequiredArgsConstructor
class JwtFilter(tokenProvider: TokenProvider): GenericFilterBean() {

    private val BEARER_PREFIX: String = "Bearer ";
    private var tokenProvider: TokenProvider = tokenProvider





    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val httpServletRequest: HttpServletRequest =  request as (HttpServletRequest)
        val jwt: String = this.resolveToken(httpServletRequest) ?: "";

        if ( StringUtils.hasText(jwt) &&    tokenProvider.validateToken(jwt) ) {
            val authentication: Authentication = tokenProvider.getAuthentication(jwt);
            SecurityContextHolder.getContext().authentication = authentication;
        }

        chain!!.doFilter(request, response);
    }



    private fun resolveToken(  request: HttpServletRequest ): String? {
         val bearerToken: String = request.getHeader(Constants.AUTHORIZATION);

        if(StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER_PREFIX)) {
            return bearerToken.replace(BEARER_PREFIX, "");
        }

        return null;
    }

    private fun resolveRefreshToken(  request: HttpServletRequest ): String? {
        val bearerRefreshToken: String = request.getHeader(Constants.REFRESH_TOKEN);

        if(StringUtils.hasText(bearerRefreshToken) && bearerRefreshToken.startsWith(BEARER_PREFIX)) {
            return bearerRefreshToken.replace(BEARER_PREFIX, "");
        }

        return null;
    }

}