package com.server.base.components.configure.security.cors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/server/base/components/configure/security/cors/Config;", "", "()V", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "enabled", "", "kotlinSpringBase"})
@org.springframework.context.annotation.Configuration(value = "cross_origin_configuration")
public class Config {
    
    public Config() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
}