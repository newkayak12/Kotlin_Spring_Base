package com.server.base.components.configure.security;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u000e\u0010\b\u001a\u00020\tX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/server/base/components/configure/security/Config;", "", "jwtAuthenticationEntryPoint", "Lcom/server/base/components/configure/security/jwt/JwtAuthenticationEntryPoint;", "jwtAccessDenialHandler", "Lcom/server/base/components/configure/security/jwt/JwtAccessDenialHandler;", "jwtSecurityConfig", "Lcom/server/base/components/configure/security/jwt/JwtSecurityConfig;", "byPass", "Lcom/server/base/components/configure/security/properties/byPass/ByPass;", "(Lcom/server/base/components/configure/security/jwt/JwtAuthenticationEntryPoint;Lcom/server/base/components/configure/security/jwt/JwtAccessDenialHandler;Lcom/server/base/components/configure/security/jwt/JwtSecurityConfig;Lcom/server/base/components/configure/security/properties/byPass/ByPass;)V", "jwtAccessDeniedHandler", "configure", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityCustomizer;", "enabled", "", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "httpSecurity", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"JwtAuthenticationEntryPoint", "JwtAccessDeniedHandler", "JwtSecurityConfig", "security_properties"})
@org.springframework.context.annotation.Configuration(value = "security_configuration")
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity(debug = true)
public class Config {
    private com.server.base.components.configure.security.jwt.JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private com.server.base.components.configure.security.jwt.JwtAccessDenialHandler jwtAccessDeniedHandler;
    private com.server.base.components.configure.security.jwt.JwtSecurityConfig jwtSecurityConfig;
    private com.server.base.components.configure.security.properties.byPass.ByPass byPass;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public Config(@org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.jwt.JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint, @org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.jwt.JwtAccessDenialHandler jwtAccessDenialHandler, @org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.jwt.JwtSecurityConfig jwtSecurityConfig, @org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.properties.byPass.ByPass byPass) {
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