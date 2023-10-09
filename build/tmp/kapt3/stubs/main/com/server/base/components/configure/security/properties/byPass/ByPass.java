package com.server.base.components.configure.security.properties.byPass;

import java.lang.System;

@lombok.Setter()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016\u00a2\u0006\u0002\u0010\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/server/base/components/configure/security/properties/byPass/ByPass;", "", "()V", "ignorePath", "", "", "getIgnorePath", "()Ljava/util/List;", "setIgnorePath", "(Ljava/util/List;)V", "ignoreSecurityPath", "", "()[Ljava/lang/String;", "kotlinSpringBase"})
@org.springframework.boot.context.properties.ConfigurationProperties(value = "security")
@org.springframework.stereotype.Component(value = "security_properties")
public class ByPass {
    public java.util.List<java.lang.String> ignorePath;
    
    public ByPass() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> getIgnorePath() {
        return null;
    }
    
    public void setIgnorePath(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] ignoreSecurityPath() {
        return null;
    }
}