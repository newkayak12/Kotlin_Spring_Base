package com.server.base.components.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J#\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004\u00a2\u0006\u0002\u0010\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/server/base/components/base/BaseService;", "", "()V", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "getBCryptPasswordEncoder", "()Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "setBCryptPasswordEncoder", "(Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;)V", "mapper", "Lorg/modelmapper/ModelMapper;", "getMapper", "()Lorg/modelmapper/ModelMapper;", "setMapper", "(Lorg/modelmapper/ModelMapper;)V", "encryptPassword", "", "accountDto", "Lcom/server/base/repository/dto/reference/AccountDto;", "isPasswordMatched", "", "rawPassword", "", "encryptedPassword", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "kotlinSpringBase"})
public class BaseService {
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder;
    @org.springframework.beans.factory.annotation.Autowired()
    public org.modelmapper.ModelMapper mapper;
    
    public BaseService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder getBCryptPasswordEncoder() {
        return null;
    }
    
    public void setBCryptPasswordEncoder(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.modelmapper.ModelMapper getMapper() {
        return null;
    }
    
    public void setMapper(@org.jetbrains.annotations.NotNull()
    org.modelmapper.ModelMapper p0) {
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