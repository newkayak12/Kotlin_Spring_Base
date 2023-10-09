package com.server.base.repository.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/server/base/repository/domain/Account;", "Ljava/io/Serializable;", "()V", "lastSignDate", "Ljava/time/LocalDateTime;", "refreshToken", "", "regDate", "role", "Lcom/server/base/components/enums/Role;", "userId", "userNo", "", "Ljava/lang/Long;", "userPwd", "renewSignDate", "", "signUpDate", "kotlinSpringBase"})
@org.hibernate.annotations.DynamicUpdate()
@org.hibernate.annotations.DynamicInsert()
@javax.persistence.Entity()
@javax.persistence.Table(name = "account")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Cacheable()
public final class Account implements java.io.Serializable {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Column(name = "userNo", columnDefinition = "BIGINT(20)")
    @javax.persistence.Id()
    private final java.lang.Long userNo = null;
    @javax.persistence.Column(name = "userId", columnDefinition = "VARCHAR (100)")
    private final java.lang.String userId = null;
    @javax.persistence.Column(name = "userPwd", columnDefinition = "VARCHAR (500)")
    private final java.lang.String userPwd = null;
    @javax.persistence.Column(name = "regDate", columnDefinition = "DATETIME default CURRENT_TIMESTAMP()")
    private java.time.LocalDateTime regDate;
    @javax.persistence.Column(name = "lastSignDate", columnDefinition = "DATETIME")
    private java.time.LocalDateTime lastSignDate;
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    @javax.persistence.Column(name = "role", columnDefinition = "VARCHAR( 32 )")
    private final com.server.base.components.enums.Role role = null;
    @javax.persistence.Column(name = "refreshToken", columnDefinition = "VARCHAR(1024)")
    private final java.lang.String refreshToken = null;
    
    public Account() {
        super();
    }
    
    @javax.persistence.PostLoad()
    public final void renewSignDate() {
    }
    
    @javax.persistence.PrePersist()
    public final void signUpDate() {
    }
}