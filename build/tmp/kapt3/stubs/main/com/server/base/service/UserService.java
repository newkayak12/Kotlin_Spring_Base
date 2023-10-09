package com.server.base.service;

import java.lang.System;

@lombok.extern.slf4j.Slf4j()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J!\u0010\u0013\u001a\u00020\r2\r\u0010\u0014\u001a\t\u0018\u00010\u0015\u00a2\u0006\u0002\b\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/server/base/service/UserService;", "Lcom/server/base/components/base/BaseService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "()V", "repository", "Lcom/server/base/repository/userRepository/UserRepository;", "tokenProvider", "Lcom/server/base/components/configure/security/jwt/TokenProvider;", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "refreshAccessToken", "Lcom/server/base/repository/dto/reference/AccountDto;", "signInRequest", "Lcom/server/base/repository/dto/request/SignInRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "signIn", "signUp", "signUpRequest", "Lcom/server/base/repository/dto/request/SignUpRequest;", "Ljavax/validation/Valid;", "kotlinSpringBase"})
@org.springframework.transaction.annotation.Transactional(rollbackFor = {java.lang.Exception.class})
@org.springframework.stereotype.Service()
public class UserService extends com.server.base.components.base.BaseService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.TokenProvider tokenProvider;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.repository.userRepository.UserRepository repository;
    
    public UserService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.server.base.repository.dto.reference.AccountDto refreshAccessToken(@org.jetbrains.annotations.NotNull()
    com.server.base.repository.dto.request.SignInRequest signInRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.server.base.repository.dto.reference.AccountDto signIn(@org.jetbrains.annotations.Nullable()
    com.server.base.repository.dto.request.SignInRequest signInRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.server.base.repository.dto.reference.AccountDto signUp(@org.jetbrains.annotations.Nullable()
    com.server.base.repository.dto.request.SignUpRequest signUpRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
}