package com.server.base.components.configure.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017J&\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/server/base/components/configure/security/jwt/JwtAccessDenialHandler;", "Lorg/springframework/security/web/access/AccessDeniedHandler;", "resolver", "Lorg/springframework/web/servlet/HandlerExceptionResolver;", "(Lorg/springframework/web/servlet/HandlerExceptionResolver;)V", "enabled", "", "handle", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "accessDeniedException", "Lorg/springframework/security/access/AccessDeniedException;", "kotlinSpringBase"})
@org.springframework.stereotype.Component(value = "JwtAccessDeniedHandler")
public class JwtAccessDenialHandler implements org.springframework.security.web.access.AccessDeniedHandler {
    private org.springframework.web.servlet.HandlerExceptionResolver resolver;
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public JwtAccessDenialHandler(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Qualifier(value = "handlerExceptionResolver")
    org.springframework.web.servlet.HandlerExceptionResolver resolver) {
        super();
    }
    
    @java.lang.Override()
    public void handle(@org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.Nullable()
    org.springframework.security.access.AccessDeniedException accessDeniedException) {
    }
}