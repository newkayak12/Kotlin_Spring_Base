package com.server.base.components.configure.security;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/server/base/components/configure/security/Config;", "", "()V", "byPass", "Lcom/server/base/components/configure/security/properties/byPass/ByPass;", "jwtAccessDeniedHandler", "Lcom/server/base/components/configure/security/jwt/JwtAccessDenialHandler;", "jwtAuthenticationEntryPoint", "Lcom/server/base/components/configure/security/jwt/JwtAuthenticationEntryPoint;", "jwtSecurityConfig", "Lcom/server/base/components/configure/security/jwt/JwtSecurityConfig;", "configure", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityCustomizer;", "enabled", "", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "httpSecurity", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"JwtAuthenticationEntryPoint", "JwtAccessDeniedHandler", "JwtSecurityConfig", "security_properties"})
@org.springframework.context.annotation.Configuration(value = "security_configuration")
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity(debug = true)
public class Config {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.JwtAccessDenialHandler jwtAccessDeniedHandler;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.JwtSecurityConfig jwtSecurityConfig;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.properties.byPass.ByPass byPass;
    
    public Config() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer configure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.web.SecurityFilterChain filterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity) {
        return null;
    }
}