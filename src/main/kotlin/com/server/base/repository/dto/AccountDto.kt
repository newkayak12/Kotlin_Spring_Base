package com.server.base.repository.dto

import com.querydsl.core.annotations.QueryProjection
import com.server.base.components.enums.Role
import com.server.base.components.validations.AccountValid
import com.server.base.components.validations.ProfileValid
import com.server.base.components.validations.TicketValid
import io.swagger.v3.oas.annotations.Hidden
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.util.StringUtils
import java.time.LocalDateTime
import javax.validation.constraints.NotEmpty

class AccountDto: UserDetails {

    @NotEmpty(message = "계정 정보가 필요합니다.", groups = [ ProfileValid.Save::class, TicketValid.Raise::class])
    private var userNo: Long?;

    @Schema(defaultValue = "test")
    @NotEmpty(message = "아이디를 입력하세요.", groups = [ AccountValid.SignUp::class, AccountValid.SignIn::class, AccountValid.FindPwd::class])
    private var userId: String?;

    @Schema(defaultValue = "1212")
    @NotEmpty(message = "비밀번호를 입력하세요.", groups = [
        AccountValid.SignUp::class,
        AccountValid.SignIn::class,
        AccountValid.changePwd::class
    ])
    private var userPwd: String?;

    @Hidden
    private var regDate: LocalDateTime?;
    @Hidden
    private var lastSignDate: LocalDateTime?;
    @Hidden
    private var role: Role?;
    @Hidden
    private var refreshToken: String?;

    @QueryProjection
    constructor(
            userNo: Long,
            userId: String,
            userPwd: String,
            regDate: LocalDateTime,
            lastSignDate: LocalDateTime,
            role: Role,
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
             userNo: Long,
             userId: String,
             userPwd: String,
             regDate: LocalDateTime,
             lastSignDate: LocalDateTime,
             role: Role
    ): this(
            userNo,
            userId,
            userPwd,
            regDate,
            lastSignDate,
            role,
            null

    ) {

    }





    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        TODO("Not yet implemented")
        var authorities: MutableSet<GrantedAuthority> =  HashSet();

        return authorities;
    }

    override fun getPassword(): String {
        TODO("Not yet implemented")
    }

    override fun getUsername(): String {
        TODO("Not yet implemented")
    }

    override fun isAccountNonExpired(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isAccountNonLocked(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isCredentialsNonExpired(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(): Boolean {
        TODO("Not yet implemented")
    }
    @Hidden
    public fun isInValid (): Boolean {

        return  (this.userNo != null) ||
                (StringUtils.hasText(this.userId) )||
                (this.role != null);
    }
}