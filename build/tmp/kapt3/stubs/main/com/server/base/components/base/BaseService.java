package com.server.base.components.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004J#\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0004\u00a2\u0006\u0002\u0010\u0010R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/server/base/components/base/BaseService;", "", "()V", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "mapper", "Lorg/modelmapper/ModelMapper;", "encryptPassword", "", "accountDto", "Lcom/server/base/repository/dto/reference/AccountDto;", "isPasswordMatched", "", "rawPassword", "", "encryptedPassword", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "kotlinSpringBase"})
public class BaseService {
    @org.springframework.beans.factory.annotation.Autowired()
    private org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder;
    @org.springframework.beans.factory.annotation.Autowired()
    private org.modelmapper.ModelMapper mapper;
    
    public BaseService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Boolean isPasswordMatched(@org.jetbrains.annotations.Nullable()
    java.lang.String rawPassword, @org.jetbrains.annotations.Nullable()
    java.lang.String encryptedPassword) {
        return null;
    }
    
    protected final void encryptPassword(@org.jetbrains.annotations.NotNull()
    com.server.base.repository.dto.reference.AccountDto accountDto) {
    }
}