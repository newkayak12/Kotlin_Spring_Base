package com.server.base.components.configure.security.jwt;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@lombok.extern.slf4j.Slf4j()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0012J\b\u0010\u0016\u001a\u00020\bH\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0092.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/server/base/components/configure/security/jwt/TokenProvider;", "Lorg/springframework/beans/factory/InitializingBean;", "mapper", "Lorg/modelmapper/ModelMapper;", "tokenDuration", "Lcom/server/base/components/configure/security/properties/duration/TokenDuration;", "(Lorg/modelmapper/ModelMapper;Lcom/server/base/components/configure/security/properties/duration/TokenDuration;)V", "BEARER_PREFIX", "", "BODY", "TIMESTAMP", "key", "Ljava/security/Key;", "afterPropertiesSet", "", "createRefreshToken", "authentication", "Lorg/springframework/security/core/Authentication;", "createToken", "getAuthentication", "token", "getSecretKey", "readDefault", "validateRefreshToken", "", "refresh", "validateToken", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"constants", "security_token_properties"})
@org.springframework.stereotype.Component(value = "TokenProvider")
public class TokenProvider implements org.springframework.beans.factory.InitializingBean {
    private java.security.Key key;
    private final java.lang.String BODY = "BODY";
    private final java.lang.String BEARER_PREFIX = "Bearer ";
    private final java.lang.String TIMESTAMP = "TIMESTAMP";
    private org.modelmapper.ModelMapper mapper;
    private com.server.base.components.configure.security.properties.duration.TokenDuration tokenDuration;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public TokenProvider(@org.jetbrains.annotations.NotNull()
    org.modelmapper.ModelMapper mapper, @org.jetbrains.annotations.NotNull()
    com.server.base.components.configure.security.properties.duration.TokenDuration tokenDuration) {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @java.lang.Override()
    public void afterPropertiesSet() throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String createToken(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String createRefreshToken(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    public boolean validateToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return false;
    }
    
    public boolean validateRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refresh) {
        return false;
    }
    
    private java.lang.String getSecretKey() {
        return null;
    }
    
    private java.lang.String readDefault() {
        return null;
    }
}