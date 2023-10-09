package com.server.base.repository.userRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/server/base/repository/userRepository/UserRepositoryCustom;", "", "signIn", "Ljava/util/Optional;", "Lcom/server/base/repository/dto/reference/AccountDto;", "signInRequest", "Lcom/server/base/repository/dto/request/SignInRequest;", "kotlinSpringBase"})
public abstract interface UserRepositoryCustom {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<com.server.base.repository.dto.reference.AccountDto> signIn(@org.jetbrains.annotations.Nullable()
    com.server.base.repository.dto.request.SignInRequest signInRequest);
}