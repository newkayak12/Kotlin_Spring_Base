package com.server.base.repository.dto.reference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rBC\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\'\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016J\b\u00100\u001a\u00020-H\u0016J\b\u00101\u001a\u00020-H\u0007R \u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/server/base/repository/dto/reference/AccountDto;", "Lorg/springframework/security/core/userdetails/UserDetails;", "userNo", "", "userId", "", "userPwd", "regDate", "Ljava/time/LocalDateTime;", "lastSignDate", "role", "Lcom/server/base/components/enums/Role;", "refreshToken", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/server/base/components/enums/Role;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Lcom/server/base/components/enums/Role;)V", "()V", "getLastSignDate", "()Ljava/time/LocalDateTime;", "setLastSignDate", "(Ljava/time/LocalDateTime;)V", "getRefreshToken", "()Ljava/lang/String;", "setRefreshToken", "(Ljava/lang/String;)V", "getRegDate", "setRegDate", "getRole", "()Lcom/server/base/components/enums/Role;", "setRole", "(Lcom/server/base/components/enums/Role;)V", "getUserId", "setUserId", "getUserNo", "()Ljava/lang/Long;", "setUserNo", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUserPwd", "setUserPwd", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "isInValid", "kotlinSpringBase"})
public class AccountDto implements org.springframework.security.core.userdetails.UserDetails {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotEmpty(message = "\uacc4\uc815 \uc815\ubcf4\uac00 \ud544\uc694\ud569\ub2c8\ub2e4.", groups = {com.server.base.components.validations.ProfileValid.Save.class, com.server.base.components.validations.TicketValid.Raise.class})
    private java.lang.Long userNo;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotEmpty(message = "\uc544\uc774\ub514\ub97c \uc785\ub825\ud558\uc138\uc694.", groups = {com.server.base.components.validations.AccountValid.SignUp.class, com.server.base.components.validations.AccountValid.SignIn.class, com.server.base.components.validations.AccountValid.FindPwd.class})
    @io.swagger.v3.oas.annotations.media.Schema(defaultValue = "test")
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotEmpty(message = "\ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud558\uc138\uc694.", groups = {com.server.base.components.validations.AccountValid.SignUp.class, com.server.base.components.validations.AccountValid.SignIn.class, com.server.base.components.validations.AccountValid.changePwd.class})
    @io.swagger.v3.oas.annotations.media.Schema(defaultValue = "1212")
    private java.lang.String userPwd;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Hidden()
    private java.time.LocalDateTime regDate;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Hidden()
    private java.time.LocalDateTime lastSignDate;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Hidden()
    private com.server.base.components.enums.Role role;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Hidden()
    private java.lang.String refreshToken;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getUserNo() {
        return null;
    }
    
    public void setUserNo(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUserId() {
        return null;
    }
    
    public void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUserPwd() {
        return null;
    }
    
    public void setUserPwd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getRegDate() {
        return null;
    }
    
    public void setRegDate(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.LocalDateTime getLastSignDate() {
        return null;
    }
    
    public void setLastSignDate(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.server.base.components.enums.Role getRole() {
        return null;
    }
    
    public void setRole(@org.jetbrains.annotations.Nullable()
    com.server.base.components.enums.Role p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getRefreshToken() {
        return null;
    }
    
    public void setRefreshToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @com.querydsl.core.annotations.QueryProjection()
    public AccountDto(@org.jetbrains.annotations.Nullable()
    java.lang.Long userNo, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String userPwd, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime regDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime lastSignDate, @org.jetbrains.annotations.Nullable()
    com.server.base.components.enums.Role role, @org.jetbrains.annotations.Nullable()
    java.lang.String refreshToken) {
        super();
    }
    
    @com.querydsl.core.annotations.QueryProjection()
    public AccountDto(@org.jetbrains.annotations.Nullable()
    java.lang.Long userNo, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String userPwd, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime regDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime lastSignDate, @org.jetbrains.annotations.Nullable()
    com.server.base.components.enums.Role role) {
        super();
    }
    
    public AccountDto() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @io.swagger.v3.oas.annotations.Hidden()
    public final boolean isInValid() {
        return false;
    }
}