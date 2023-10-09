package com.server.base.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/server/base/controller/TestController;", "", "()V", "test", "", "principal", "Ljava/security/Principal;", "kotlinSpringBase"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/v1/test"})
@org.springframework.web.bind.annotation.RestController()
public class TestController {
    
    public TestController() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping()
    public java.lang.String test(@org.jetbrains.annotations.NotNull()
    java.security.Principal principal) {
        return null;
    }
}