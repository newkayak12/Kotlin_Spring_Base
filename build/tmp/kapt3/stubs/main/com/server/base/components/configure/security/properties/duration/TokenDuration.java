package com.server.base.components.configure.security.properties.duration;

import java.lang.System;

@lombok.Setter()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/server/base/components/configure/security/properties/duration/TokenDuration;", "", "()V", "expireTime", "Lcom/server/base/components/configure/security/properties/duration/Durations;", "getExpireTime", "()Lcom/server/base/components/configure/security/properties/duration/Durations;", "", "kotlinSpringBase"})
@org.springframework.boot.context.properties.ConfigurationProperties(value = "jwt")
@org.springframework.stereotype.Component(value = "security_token_properties")
public class TokenDuration {
    @org.jetbrains.annotations.Nullable()
    private final com.server.base.components.configure.security.properties.duration.Durations expireTime = null;
    
    public TokenDuration() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.server.base.components.configure.security.properties.duration.Durations getExpireTime() {
        return null;
    }
    
    public long getExpireTime() {
        return 0L;
    }
}