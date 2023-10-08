package com.server.base.components.configure.security.jwt

import com.server.base.components.configure.msg
import io.jsonwebtoken.IncorrectClaimException
import io.jsonwebtoken.UnsupportedJwtException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerExceptionResolver
import javax.annotation.PostConstruct
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Component(value = "JwtAuthenticationEntryPoint")
class JwtAuthenticationEntryPoint: AuthenticationEntryPoint {
    private var resolver: HandlerExceptionResolver;

    @PostConstruct
    fun enabled() {
        val configuration = "JwtAuthenticationEntryPoint";
        msg(configuration);
    }

    @Autowired
    constructor(@Qualifier("handlerExceptionResolver") resolver: HandlerExceptionResolver) {
        this.resolver = resolver
    }

    override fun commence(request: HttpServletRequest?, response: HttpServletResponse?, authException: AuthenticationException?) {
        resolver.resolveException(request!!, response!!, null, IncorrectClaimException(null, null, authException?.message, authException?.cause))
    }
}