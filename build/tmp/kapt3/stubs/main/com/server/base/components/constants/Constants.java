package com.server.base.components.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0017J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0017J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0017\u00a8\u0006\u0010"}, d2 = {"Lcom/server/base/components/constants/Constants;", "", "()V", "setEmail", "", "_EMAIL", "", "setEmailKey", "_EMAIL_KEY", "setProjectName", "_PROJECT_NAME", "setSalt", "_SALT", "setTokenName", "_TOKEN_NAME", "Companion", "kotlinSpringBase"})
@org.springframework.stereotype.Component(value = "constants")
public class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.server.base.components.constants.Constants.Companion Companion = null;
    public static java.lang.String SALT;
    public static java.lang.String TOKEN_NAME;
    public static java.lang.String PROJECT_NAME;
    public static java.lang.String EMAIL;
    public static java.lang.String EMAIL_KEY;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String AUTHORIZATION = "Authorization";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String REFRESH_TOKEN = "Refresh";
    
    public Constants() {
        super();
    }
    
    @org.springframework.beans.factory.annotation.Value(value = "${constant.salt}")
    public void setSalt(@org.jetbrains.annotations.NotNull()
    java.lang.String _SALT) {
    }
    
    @org.springframework.beans.factory.annotation.Value(value = "${constant.token_name}")
    public void setTokenName(@org.jetbrains.annotations.NotNull()
    java.lang.String _TOKEN_NAME) {
    }
    
    @org.springframework.beans.factory.annotation.Value(value = "${constant.project_name}")
    public void setProjectName(@org.jetbrains.annotations.NotNull()
    java.lang.String _PROJECT_NAME) {
    }
    
    @org.springframework.beans.factory.annotation.Value(value = "${constant.email}")
    public void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String _EMAIL) {
    }
    
    @org.springframework.beans.factory.annotation.Value(value = "${constant.email_key}")
    public void setEmailKey(@org.jetbrains.annotations.NotNull()
    java.lang.String _EMAIL_KEY) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/server/base/components/constants/Constants$Companion;", "", "()V", "AUTHORIZATION", "", "getAUTHORIZATION", "()Ljava/lang/String;", "setAUTHORIZATION", "(Ljava/lang/String;)V", "EMAIL", "getEMAIL", "setEMAIL", "EMAIL_KEY", "getEMAIL_KEY", "setEMAIL_KEY", "PROJECT_NAME", "getPROJECT_NAME", "setPROJECT_NAME", "REFRESH_TOKEN", "getREFRESH_TOKEN", "setREFRESH_TOKEN", "SALT", "getSALT", "setSALT", "TOKEN_NAME", "getTOKEN_NAME", "setTOKEN_NAME", "kotlinSpringBase"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSALT() {
            return null;
        }
        
        public final void setSALT(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTOKEN_NAME() {
            return null;
        }
        
        public final void setTOKEN_NAME(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROJECT_NAME() {
            return null;
        }
        
        public final void setPROJECT_NAME(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEMAIL() {
            return null;
        }
        
        public final void setEMAIL(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEMAIL_KEY() {
            return null;
        }
        
        public final void setEMAIL_KEY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAUTHORIZATION() {
            return null;
        }
        
        public final void setAUTHORIZATION(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getREFRESH_TOKEN() {
            return null;
        }
        
        public final void setREFRESH_TOKEN(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}