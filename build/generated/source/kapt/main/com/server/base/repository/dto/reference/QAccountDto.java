package com.server.base.repository.dto.reference;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.server.base.repository.dto.reference.QAccountDto is a Querydsl Projection type for AccountDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QAccountDto extends ConstructorExpression<AccountDto> {

    private static final long serialVersionUID = -238122711L;

    public QAccountDto(com.querydsl.core.types.Expression<Long> userNo, com.querydsl.core.types.Expression<String> userId, com.querydsl.core.types.Expression<String> userPwd, com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> lastSignDate, com.querydsl.core.types.Expression<com.server.base.components.enums.Role> role, com.querydsl.core.types.Expression<String> refreshToken) {
        super(AccountDto.class, new Class<?>[]{long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, com.server.base.components.enums.Role.class, String.class}, userNo, userId, userPwd, regDate, lastSignDate, role, refreshToken);
    }

    public QAccountDto(com.querydsl.core.types.Expression<Long> userNo, com.querydsl.core.types.Expression<String> userId, com.querydsl.core.types.Expression<String> userPwd, com.querydsl.core.types.Expression<java.time.LocalDateTime> regDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> lastSignDate, com.querydsl.core.types.Expression<com.server.base.components.enums.Role> role) {
        super(AccountDto.class, new Class<?>[]{long.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, com.server.base.components.enums.Role.class}, userNo, userId, userPwd, regDate, lastSignDate, role);
    }

}

