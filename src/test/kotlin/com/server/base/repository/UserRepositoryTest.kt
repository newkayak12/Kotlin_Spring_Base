package com.server.base.repository

import com.server.base.components.expcetions.BecauseOf
import com.server.base.components.expcetions.CommonException
import com.server.base.repository.dto.reference.AccountDto
import com.server.base.repository.dto.request.SignInRequest
import com.server.base.repository.userRepository.UserRepository
import com.server.base.util.AbstractRepositoryTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import java.util.function.Supplier

class UserRepositoryTest(): AbstractRepositoryTest() {


    @Autowired
    private lateinit var repository: UserRepository


    @Nested
    @DisplayName("로그인 테스트")
    open inner class SingInTest {
        @Test
        @DisplayName(value = "로그인 성공")
        fun signInSuccess() {
            //given
            val signInRequest = SignInRequest()
            signInRequest.userId = "test"
            signInRequest.userPwd = "pwd"
            Assertions.assertThat<AccountDto>(repository.signIn(signInRequest).orElseGet{ null })
                    .extracting<String>(AccountDto::userId).isEqualTo("test")
        }

        @Test
        @DisplayName(value = "로그인 실패 성공")
        fun signInFailTestSuccess() {
            //given
            val signInRequest = SignInRequest()
            signInRequest.userId = "test2"
            signInRequest.userPwd = "pwd"
            Assertions.assertThat<AccountDto>(repository.signIn(signInRequest).orElseGet{ null })
                    .isEqualTo(null)
        }

        @Test
        @DisplayName(value = "로그인 실패")
        fun signInFailure() {
            //given
            val signInRequest = SignInRequest()
            signInRequest.userId = "test23"
            signInRequest.userPwd = "pwd"
            Assertions.assertThatThrownBy { repository.signIn(signInRequest).orElseThrow{ CommonException(BecauseOf.ACCOUNT_NOT_EXIST) } }
                    .hasMessage(BecauseOf.ACCOUNT_NOT_EXIST.getMsg())
        }
    }
}