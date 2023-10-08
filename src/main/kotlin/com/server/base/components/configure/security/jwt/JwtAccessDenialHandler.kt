package com.server.base.components.configure.security.jwt

import com.server.base.components.configure.msg
import io.jsonwebtoken.UnsupportedJwtException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.security.access.AccessDeniedException
import org.springframework.security.web.access.AccessDeniedHandler
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerExceptionResolver
import javax.annotation.PostConstruct
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component(value = "JwtAccessDeniedHandler")
class JwtAccessDenialHandler: AccessDeniedHandler {
    private var resolver: HandlerExceptionResolver;

    @PostConstruct
    fun enabled() {
        val configuration = "JwtAccessDeniedHandler";
        msg(configuration);
    }

    @Autowired
    constructor(@Qualifier("handlerExceptionResolver") resolver: HandlerExceptionResolver) {
        this.resolver = resolver
    }

    override fun handle(request: HttpServletRequest?, response: HttpServletResponse?, accessDeniedException: AccessDeniedException?) {
        resolver.resolveException(request!!, response!!, null, UnsupportedJwtException(accessDeniedException?.message, accessDeniedException?.cause))
    }
}