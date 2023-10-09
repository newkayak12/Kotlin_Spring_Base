package com.server.base.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004J\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0014\u0010\n\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/server/base/repository/userRepository/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/server/base/repository/domain/Account;", "", "Lcom/server/base/repository/userRepository/UserRepositoryCustom;", "countAccountByUserId", "Ljava/util/Optional;", "userId", "", "findAccountByUserId", "wakeUpMsg", "Msg", "kotlinSpringBase"})
@org.springframework.stereotype.Repository()
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<com.server.base.repository.domain.Account, java.lang.Long>, com.server.base.repository.userRepository.UserRepositoryCustom {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(nativeQuery = true, value = "SELECT :msg FROM DUAL;")
    public abstract java.lang.String wakeUpMsg(@org.jetbrains.annotations.Nullable()
    @org.springframework.data.repository.query.Param(value = "msg")
    java.lang.String Msg);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<java.lang.Long> countAccountByUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<com.server.base.repository.domain.Account> findAccountByUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String userId);
}