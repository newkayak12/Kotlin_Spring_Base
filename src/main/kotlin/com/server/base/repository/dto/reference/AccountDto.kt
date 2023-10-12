package com.server.base.repository.dto.reference

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.querydsl.core.annotations.QueryProjection
import com.server.base.components.enums.Role
import com.server.base.components.validations.AccountValid
import com.server.base.components.validations.ProfileValid
import com.server.base.components.validations.TicketValid
import io.swagger.v3.oas.annotations.Hidden
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.io.Serializable
import java.time.LocalDateTime
import java.util.*
import javax.validation.constraints.NotEmpty

@JsonIgnoreProperties(value = ["regDate", "lastSignDate", "userPwd", "role", "refreshToken"], allowGetters = false)
open class AccountDto: UserDetails, Serializable {

    @NotEmpty(message = "계정 정보가 필요합니다.", groups = [ ProfileValid.Save::class, TicketValid.Raise::class])
    open var userNo: Long? = null;

    @Schema(defaultValue = "test")
    @NotEmpty(message = "아이디를 입력하세요.", groups = [ AccountValid.SignUp::class, AccountValid.SignIn::class, AccountValid.FindPwd::class])
    open var userId: String? = null;

    @Schema(defaultValue = "1212")
    @NotEmpty(message = "비밀번호를 입력하세요.", groups = [
        AccountValid.SignUp::class,
        AccountValid.SignIn::class,
        AccountValid.changePwd::class
    ])
    open var userPwd: String? = null;

    @Hidden
    open var regDate: LocalDateTime? = null;
    @Hidden
    open var lastSignDate: LocalDateTime? = null;
    @Hidden
    open var role: Role? = null;
    @Hidden
    open var refreshToken: String? = null;

    @QueryProjection
    constructor(
            userNo: Long?,
            userId: String?,
            userPwd: String?,
            regDate: LocalDateTime?,
            lastSignDate: LocalDateTime?,
            role: Role?,
            refreshToken: String?
    ) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPwd = userPwd;
        this.regDate = regDate;
        this.lastSignDate = lastSignDate;
        this.role = role;
        this.refreshToken = refreshToken;
    }

    @QueryProjection
    constructor(
             userNo: Long?,
             userId: String?,
             userPwd: String?,
             regDate: LocalDateTime?,
             lastSignDate: LocalDateTime?,
             role: Role?
    ): this(
            userNo,
            userId,
            userPwd,
            regDate,
            lastSignDate,
            role,
            null

    )
    constructor()





    @Hidden
    override fun getAuthorities(): Collection<GrantedAuthority> {
        return setOf(SimpleGrantedAuthority(role!!.name))
    }

    @Hidden
    override fun getPassword(): String? {
        return null
    }

    @Hidden
    override fun getUsername(): String? {
        return this.userId
    }

    @Hidden
    override fun isAccountNonExpired(): Boolean {
        return true
    }

    @Hidden
    override fun isAccountNonLocked(): Boolean {
        return true
    }

    @Hidden
    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    @Hidden
    override fun isEnabled(): Boolean {
        return true
    }

    @Hidden
    open fun isInValid(): Boolean {
        return Objects.isNull(userNo) ||
                Objects.isNull(userId) ||
                Objects.isNull(role)
    }
}