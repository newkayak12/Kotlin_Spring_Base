package com.server.base.components.configure.security.jwt;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/server/base/components/configure/security/jwt/JwtFilter;", "Lorg/springframework/web/filter/GenericFilterBean;", "tokenProvider", "Lcom/server/base/components/configure/security/jwt/TokenProvider;", "(Lcom/server/base/components/configure/security/jwt/TokenProvider;)V", "BEARER_PREFIX", "", "doFilter", "", "request", "Ljavax/servlet/ServletRequest;", "response", "Ljavax/servlet/ServletResponse;", "chain", "Ljavax/servlet/FilterChain;", "resolveRefreshToken", "Ljavax/servlet/http/HttpServletRequest;", "resolveToken", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"constants", "TokenProvider"})
@org.springframework.stereotype.Component(value = "JwtFilter")
public class JwtFilter extends org.springframework.web.filter.GenericFilterBean {
    private final java.lang.String BEARER_PREFIX = "Bearer ";
    private com.server.base.components.configure.security.jwt.TokenProvider tokenProvider;
    
    public JwtFilter(@org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.jwt.TokenProvider tokenProvider) {
        super();
    }
    
    @java.lang.Override()
    public void doFilter(@org.jetbrains.annotations.Nullable()
    javax.servlet.ServletRequest request, @org.jetbrains.annotations.Nullable()
    javax.servlet.ServletResponse response, @org.jetbrains.annotations.Nullable()
    javax.servlet.FilterChain chain) {
    }
    
    private java.lang.String resolveToken(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    private java.lang.String resolveRefreshToken(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}