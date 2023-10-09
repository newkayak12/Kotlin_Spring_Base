package com.server.base.components.configure.swagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0012J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/server/base/components/configure/swagger/Config;", "", "()V", "apiInfo", "Lio/swagger/v3/oas/models/info/Info;", "enabled", "", "openApi", "Lio/swagger/v3/oas/models/OpenAPI;", "kotlinSpringBase"})
@org.springframework.context.annotation.DependsOn(value = {"constants"})
@org.springframework.context.annotation.Configuration(value = "swagger_configuration")
public class Config {
    
    public Config() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public io.swagger.v3.oas.models.OpenAPI openApi() {
        return null;
    }
    
    private io.swagger.v3.oas.models.info.Info apiInfo() {
        return null;
    }
}