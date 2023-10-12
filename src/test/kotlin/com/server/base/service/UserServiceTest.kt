package com.server.base.service

import com.server.base.components.configure.security.jwt.TokenProvider
import com.server.base.components.expcetions.BecauseOf
import com.server.base.components.expcetions.CommonException
import com.server.base.repository.dto.reference.AccountDto
import com.server.base.repository.dto.request.SignInRequest
import com.server.base.repository.userRepository.UserRepository
import com.server.base.util.AbstractServiceTest
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.*
import org.mockito.Mockito.*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.util.*
import javax.servlet.http.HttpServletResponse


class UserServiceTest: AbstractServiceTest() {
    @InjectMocks
    private lateinit var service: UserService

    @Mock
    private lateinit var repository: UserRepository

    @Mock
    private lateinit var response: HttpServletResponse

    @Mock
    private lateinit var tokenProvider: TokenProvider

    @Spy
    private lateinit var bCryptPasswordEncoder: BCryptPasswordEncoder




    @Nested
    @DisplayName(value = "로그인 service 테스트")
    open inner class SignInTest {
        var accountDto: AccountDto? = null
        @BeforeEach
        fun setAccountDto() {
            accountDto = AccountDto()
            accountDto!!.userNo = 22L
            accountDto!!.userId = "test"
            accountDto!!.userPwd = "$2a$10$7Ti7tDKkCZfDdbpHgVnQGuUZrbyGcHflYGtUlSiDVesI/jt.lIysS"
        }

        @Test
        @DisplayName(value = "성공")
        @Throws(CommonException::class)
        fun success() {

            //given
            val request = SignInRequest()
            request.userId = "test"
            request.userPwd = "1212"

            //when
            `when`(repository.signIn(any())).thenReturn(Optional.ofNullable(accountDto!!))
            Mockito.`when`<Boolean>(bCryptPasswordEncoder.matches(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(true)
            `when`(tokenProvider.createToken(any())).thenReturn(anyString())

            //then
            assertThat(service.signIn(request, response))
                    .extracting<String>(AccountDto::userId).isEqualTo(accountDto!!.userId)

        }

        @Test
        @DisplayName(value = "실패 - 아이디 틀림")
        @Throws(CommonException::class)
        fun failure_Id() {

            //given
            val request = SignInRequest()
            request.userId = "test"
            request.userPwd = "1213"

            //when
            Mockito.`when`<Optional<AccountDto>?>(repository.signIn(request)).thenReturn(Optional.empty())

            //then
            assertThatThrownBy { service.signIn(request, response) }
                    .message().isEqualTo(BecauseOf.ACCOUNT_NOT_EXIST.getMsg())
        }

        @Test
        @DisplayName(value = "실패 - 비밀번호 틀림")
        @Throws(CommonException::class)
        fun failure_pwd() {

            //given
            val request = SignInRequest()
            request.userId = "test"
            request.userPwd = "1213"

            //when
            `when`(repository.signIn(any())).thenReturn(Optional.ofNullable(accountDto!!))
            Mockito.`when`<Boolean>(bCryptPasswordEncoder.matches(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(false)

            //then
            Assertions.assertThatThrownBy { service.signIn(request, response) }
                    .message().isEqualTo(BecauseOf.PASSWORD_NOT_MATCHED.getMsg())
        }
    }

}