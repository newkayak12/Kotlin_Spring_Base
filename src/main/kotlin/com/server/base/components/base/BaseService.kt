package com.server.base.components.base

import com.server.base.repository.dto.reference.AccountDto
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

open class BaseService() {

    @Autowired
    open lateinit var bCryptPasswordEncoder: BCryptPasswordEncoder
    @Autowired
    open lateinit var mapper: ModelMapper

    protected fun isPasswordMatched(rawPassword: String?, encryptedPassword: String?): Boolean? {
        return bCryptPasswordEncoder.matches(rawPassword, encryptedPassword)
    }

    protected fun encryptPassword(accountDto: AccountDto) {
        accountDto.userPwd = bCryptPasswordEncoder.encode(accountDto.userPwd)
    }
}