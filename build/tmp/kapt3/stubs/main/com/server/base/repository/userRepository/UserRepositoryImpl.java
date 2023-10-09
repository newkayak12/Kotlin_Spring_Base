package com.server.base.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/server/base/repository/userRepository/UserRepositoryImpl;", "Lorg/springframework/data/jpa/repository/support/QuerydslRepositorySupport;", "Lcom/server/base/repository/userRepository/UserRepositoryCustom;", "()V", "query", "Lcom/querydsl/jpa/JPQLQueryFactory;", "signIn", "Ljava/util/Optional;", "Lcom/server/base/repository/dto/reference/AccountDto;", "signInRequest", "Lcom/server/base/repository/dto/request/SignInRequest;", "kotlinSpringBase"})
public class UserRepositoryImpl extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport implements com.server.base.repository.userRepository.UserRepositoryCustom {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.querydsl.jpa.JPQLQueryFactory query;
    
    public UserRepositoryImpl() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Optional<com.server.base.repository.dto.reference.AccountDto> signIn(@org.jetbrains.annotations.Nullable()
    com.server.base.repository.dto.request.SignInRequest signInRequest) {
        return null;
    }
}