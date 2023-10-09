package com.server.base.repository.userRepository

import com.server.base.repository.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository: JpaRepository<Account, Long>, UserRepositoryCustom {

    @Query(nativeQuery = true, value = "SELECT :msg FROM DUAL;")
    fun wakeUpMsg(@Param(value = "msg") Msg: String?): String

    fun countAccountByUserId(userId: String?): Optional<Long?>
    fun findAccountByUserId(userId: String?): Optional<Account?>
}