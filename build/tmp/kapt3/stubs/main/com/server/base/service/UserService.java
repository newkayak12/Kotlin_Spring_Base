package com.server.base.service;

import java.lang.System;

@lombok.extern.slf4j.Slf4j()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/server/base/service/UserService;", "Lcom/server/base/components/base/BaseService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "()V", "tokenProvider", "Lcom/server/base/components/configure/security/jwt/TokenProvider;", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "kotlinSpringBase"})
@org.springframework.transaction.annotation.Transactional(rollbackFor = {java.lang.Exception.class})
@org.springframework.stereotype.Service()
public class UserService extends com.server.base.components.base.BaseService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.components.configure.security.jwt.TokenProvider tokenProvider;
    
    public UserService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
}