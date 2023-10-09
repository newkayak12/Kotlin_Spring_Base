package com.server.base.components.configure.security.jwt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/server/base/components/configure/security/jwt/JwtAuthenticationEntryPoint;", "Lorg/springframework/security/web/AuthenticationEntryPoint;", "resolver", "Lorg/springframework/web/servlet/HandlerExceptionResolver;", "(Lorg/springframework/web/servlet/HandlerExceptionResolver;)V", "commence", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "authException", "Lorg/springframework/security/core/AuthenticationException;", "enabled", "kotlinSpringBase"})
@org.springframework.stereotype.Component(value = "JwtAuthenticationEntryPoint")
public class JwtAuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint {
    private org.springframework.web.servlet.HandlerExceptionResolver resolver;
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public JwtAuthenticationEntryPoint(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Qualifier(value = "handlerExceptionResolver")
    org.springframework.web.servlet.HandlerExceptionResolver resolver) {
        super();
    }
    
    @java.lang.Override()
    public void commence(@org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.Nullable()
    org.springframework.security.core.AuthenticationException authException) {
    }
}