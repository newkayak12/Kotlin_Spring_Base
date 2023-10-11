package com.server.base.repository.userRepository

import com.querydsl.core.types.dsl.BooleanExpression
import com.querydsl.jpa.JPQLQueryFactory
import com.server.base.repository.domain.Account
import com.server.base.repository.dto.reference.AccountDto
import com.server.base.repository.dto.request.SignInRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.util.StringUtils
import java.util.*

import com.server.base.repository.domain.QAccount.account
import com.server.base.repository.dto.reference.QAccountDto

class UserRepositoryImpl: QuerydslRepositorySupport(Account::class.java), UserRepositoryCustom {
    @Autowired
    private lateinit var query: JPQLQueryFactory


    private fun eqUserId(userId: String?): BooleanExpression? {
        return if (StringUtils.hasText(userId)) account.userId.eq(userId) else null
    }

    private fun eqUserNo(userNo: Long?): BooleanExpression? {
        return if (Objects.nonNull(userNo)) account.userNo.eq(userNo) else null
    }

    private fun eqRefreshToken(refreshToken: String?): BooleanExpression? {
        return if (StringUtils.hasText(refreshToken)) account.refreshToken.eq(refreshToken) else null
    }

    override fun signIn(signInRequest: SignInRequest?): Optional<AccountDto> {
        return Optional.ofNullable(
                query.select<AccountDto>(
                        QAccountDto(
                                account.userNo,
                                account.userId,
                                account.userPwd,
                                account.regDate,
                                account.lastSignDate,
                                account.role,
                                account.refreshToken
                        )
                )
                        .from(account)
                        .where(
                                eqUserId(signInRequest?.userId),
                                eqUserNo(signInRequest?.userNo),
                                eqRefreshToken(signInRequest?.refreshToken)
                        )
                        .fetchOne()
        )
    }
}