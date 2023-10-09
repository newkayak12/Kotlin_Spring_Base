package com.server.base.components.configure.advice;

import java.lang.System;

@lombok.extern.slf4j.Slf4j()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0017J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0017J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017\u00a8\u0006\u000f"}, d2 = {"Lcom/server/base/components/configure/advice/ControllerAdvisor;", "", "()V", "expiredTokenExceptionHandler", "Lorg/springframework/http/ResponseEntity;", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "illegalTokenExceptionHandler", "internalServerExceptionHandler", "exception", "Lcom/server/base/components/expcetions/CommonException;", "invalidTokenExceptionHandler", "noHandlerExceptionHandler", "kotlinSpringBase"})
@org.springframework.web.bind.annotation.RestControllerAdvice()
public class ControllerAdvisor {
    
    public ControllerAdvisor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.server.base.components.expcetions.CommonException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public org.springframework.http.ResponseEntity<java.lang.String> internalServerExceptionHandler(@org.jetbrains.annotations.NotNull()
    com.server.base.components.expcetions.CommonException exception) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {org.springframework.web.servlet.NoHandlerFoundException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
    public org.springframework.http.ResponseEntity<java.lang.String> noHandlerExceptionHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {io.jsonwebtoken.MalformedJwtException.class, io.jsonwebtoken.UnsupportedJwtException.class, io.jsonwebtoken.security.SignatureException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.FORBIDDEN)
    public org.springframework.http.ResponseEntity<java.lang.String> illegalTokenExceptionHandler(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {io.jsonwebtoken.IncorrectClaimException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.UNAUTHORIZED)
    public org.springframework.http.ResponseEntity<java.lang.String> invalidTokenExceptionHandler(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {io.jsonwebtoken.ExpiredJwtException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_ACCEPTABLE)
    public org.springframework.http.ResponseEntity<java.lang.String> expiredTokenExceptionHandler(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
}