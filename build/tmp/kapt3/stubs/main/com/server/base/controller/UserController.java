package com.server.base.controller;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J-\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000f\b\u0001\u0010\n\u001a\t\u0018\u00010\u000b\u00a2\u0006\u0002\b\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J7\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000f\b\u0001\u0010\u0011\u001a\t\u0018\u00010\u0012\u00a2\u0006\u0002\b\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/server/base/controller/UserController;", "", "()V", "service", "Lcom/server/base/service/UserService;", "refreshAccessToken", "Lorg/springframework/http/ResponseEntity;", "Lcom/server/base/repository/dto/reference/AccountDto;", "refreshToken", "", "signInRequest", "Lcom/server/base/repository/dto/request/SignInRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "signIn", "Ljavax/validation/Valid;", "signUp", "signUpRequest", "Lcom/server/base/repository/dto/request/SignUpRequest;", "request", "Ljavax/servlet/http/HttpServletRequest;", "kotlinSpringBase"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/user"})
@org.springframework.web.bind.annotation.RestController()
@io.swagger.v3.oas.annotations.tags.Tag(name = "\uc0ac\uc6a9\uc790 API", description = "\uc0ac\uc6a9\uc790 \uad00\ub828 API")
public class UserController {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.service.UserService service;
    
    public UserController() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.server.base.components.expcetions.CommonException.class})
    @org.springframework.web.bind.annotation.GetMapping(value = {"/sign/in"})
    @io.swagger.v3.oas.annotations.Operation(summary = "signIn")
    public org.springframework.http.ResponseEntity<com.server.base.repository.dto.reference.AccountDto> signIn(@org.jetbrains.annotations.Nullable()
    @org.springframework.validation.annotation.Validated(value = {com.server.base.components.validations.AccountValid.SignIn.class})
    @org.springframework.web.bind.annotation.ModelAttribute()
    com.server.base.repository.dto.request.SignInRequest signInRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.server.base.components.expcetions.CommonException.class})
    @org.springframework.web.bind.annotation.PostMapping(value = {"/sign/up"})
    public org.springframework.http.ResponseEntity<com.server.base.repository.dto.reference.AccountDto> signUp(@org.jetbrains.annotations.Nullable()
    @org.springframework.validation.annotation.Validated(value = {com.server.base.components.validations.AccountValid.SignUp.class})
    @org.springframework.web.bind.annotation.RequestBody()
    com.server.base.repository.dto.request.SignUpRequest signUpRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.server.base.components.expcetions.CommonException.class})
    @org.springframework.web.bind.annotation.PostMapping(value = {"/refresh/token"})
    public org.springframework.http.ResponseEntity<com.server.base.repository.dto.reference.AccountDto> refreshAccessToken(@org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.RequestHeader(value = "Refresh")
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ModelAttribute()
    com.server.base.repository.dto.request.SignInRequest signInRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
}