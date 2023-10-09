package com.server.base.repository.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -628210040L;

    public static final QAccount account = new QAccount("account");

    public final DateTimePath<java.time.LocalDateTime> lastSignDate = createDateTime("lastSignDate", java.time.LocalDateTime.class);

    public final StringPath refreshToken = createString("refreshToken");

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final EnumPath<com.server.base.components.enums.Role> role = createEnum("role", com.server.base.components.enums.Role.class);

    public final StringPath userId = createString("userId");

    public final NumberPath<Long> userNo = createNumber("userNo", Long.class);

    public final StringPath userPwd = createString("userPwd");

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

