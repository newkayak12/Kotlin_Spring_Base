package com.server.base.components.configure.modelMapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0012J\b\u0010\b\u001a\u00020\u0006H\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/server/base/components/configure/modelMapper/Config;", "", "()V", "modelMapper", "Lorg/modelmapper/ModelMapper;", "enabled", "", "strictStrategy", "useReflection", "kotlinSpringBase"})
@org.springframework.context.annotation.Configuration(value = "modelMapper_configuration")
public class Config {
    private org.modelmapper.ModelMapper modelMapper;
    
    public Config() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public void enabled() {
    }
    
    private void strictStrategy() {
    }
    
    private void useReflection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.modelmapper.ModelMapper modelMapper() {
        return null;
    }
}