package com.server.base.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0012J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0012J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0012\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/server/base/repository/userRepository/UserRepositoryImpl;", "Lorg/springframework/data/jpa/repository/support/QuerydslRepositorySupport;", "Lcom/server/base/repository/userRepository/UserRepositoryCustom;", "()V", "query", "Lcom/querydsl/jpa/JPQLQueryFactory;", "eqRefreshToken", "Lcom/querydsl/core/types/dsl/BooleanExpression;", "refreshToken", "", "eqUserId", "userId", "eqUserNo", "userNo", "", "(Ljava/lang/Long;)Lcom/querydsl/core/types/dsl/BooleanExpression;", "signIn", "Ljava/util/Optional;", "Lcom/server/base/repository/dto/reference/AccountDto;", "signInRequest", "Lcom/server/base/repository/dto/request/SignInRequest;", "kotlinSpringBase"})
public class UserRepositoryImpl extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport implements com.server.base.repository.userRepository.UserRepositoryCustom {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.querydsl.jpa.JPQLQueryFactory query;
    
    public UserRepositoryImpl() {
        super(null);
    }
    
    private com.querydsl.core.types.dsl.BooleanExpression eqUserId(java.lang.String userId) {
        return null;
    }
    
    private com.querydsl.core.types.dsl.BooleanExpression eqUserNo(java.lang.Long userNo) {
        return null;
    }
    
    private com.querydsl.core.types.dsl.BooleanExpression eqRefreshToken(java.lang.String refreshToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Optional<com.server.base.repository.dto.reference.AccountDto> signIn(@org.jetbrains.annotations.Nullable()
    com.server.base.repository.dto.request.SignInRequest signInRequest) {
        return null;
    }
}