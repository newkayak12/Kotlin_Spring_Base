package com.server.base.components.configure.objectMapper;

import java.lang.System;

@lombok.RequiredArgsConstructor()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0012J\b\u0010\b\u001a\u00020\u0006H\u0012J\b\u0010\t\u001a\u00020\u0006H\u0012J\b\u0010\n\u001a\u00020\u0006H\u0012J\b\u0010\u000b\u001a\u00020\u0006H\u0017J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\f\u001a\u00020\u0006H\u0012J\b\u0010\r\u001a\u00020\u0006H\u0012J\b\u0010\u000e\u001a\u00020\u0006H\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/server/base/components/configure/objectMapper/Config;", "", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "deserializeRegisterJavaTimeModule", "", "deserializeSettings", "deserializeWhenEmptyCase", "deserializeWhenEnumCase", "deserializeWhenUnknownCase", "enabled", "serializeDateTime", "serializeSettings", "setJavaModule", "kotlinSpringBase"})
@org.springframework.context.annotation.Configuration(value = "objectMapper_configuration")
public class Config {
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    
    public Config() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    private void deserializeWhenEmptyCase() {
    }
    
    private void deserializeWhenUnknownCase() {
    }
    
    private void serializeDateTime() {
    }
    
    private void deserializeWhenEnumCase() {
    }
    
    private void deserializeRegisterJavaTimeModule() {
    }
    
    private void deserializeSettings() {
    }
    
    private void serializeSettings() {
    }
    
    private void setJavaModule() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
        return null;
    }
}