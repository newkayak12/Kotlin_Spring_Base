package com.server.base.components.configure.security.jwt;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\bH\u0017R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/server/base/components/configure/security/jwt/JwtSecurityConfig;", "Lorg/springframework/security/config/annotation/SecurityConfigurerAdapter;", "Lorg/springframework/security/web/DefaultSecurityFilterChain;", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "()V", "jwtFilter", "Lcom/server/base/components/configure/security/jwt/JwtFilter;", "configure", "", "builder", "enabled", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"JwtFilter"})
@org.springframework.stereotype.Component(value = "JwtSecurityConfig")
public class JwtSecurityConfig extends org.springframework.security.config.annotation.SecurityConfigurerAdapter<org.springframework.security.web.DefaultSecurityFilterChain, org.springframework.security.config.annotation.web.builders.HttpSecurity> {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.JwtFilter jwtFilter;
    
    public JwtSecurityConfig() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.Nullable()
    org.springframework.security.config.annotation.web.builders.HttpSecurity builder) {
    }
}