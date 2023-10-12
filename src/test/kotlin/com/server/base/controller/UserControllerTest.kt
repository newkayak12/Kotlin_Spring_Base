package com.server.base.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.server.base.components.constants.Constants
import com.server.base.components.expcetions.BecauseOf
import com.server.base.repository.dto.request.SignUpRequest
import com.server.base.util.AbstractControllerTest
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.transaction.annotation.Transactional
import java.nio.charset.StandardCharsets


import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*

import org.springframework.test.web.servlet.result.MockMvcResultHandlers.*



class UserControllerTest(): AbstractControllerTest() {

    val prefix = "/api/v1/user"
    val signIn = "$prefix/sign/in"
    val signUp = "$prefix/sign/up"


    @Autowired
    private lateinit var mapper: ObjectMapper


    @Nested
    @DisplayName(value = "로그인 테스트")
    open inner class SignInTest {
        @Test
        @DisplayName(value = "성공")
        @Throws(Exception::class)
        fun success() {
            mockMvc.perform(
                    MockMvcRequestBuilders.get(signIn)
                            .param("userId", "test")
                            .param("userPwd", "1212")
            )
                    .andExpect(MockMvcResultMatchers.status().isOk)
                    .andExpect(MockMvcResultMatchers.header().exists(Constants.AUTHORIZATION))
                    .andDo(MockMvcResultHandlers.print())
        }

        @Test
        @DisplayName(value = "실패")
        @Throws(Exception::class)
        fun failure() {
            mockMvc.perform(
                    MockMvcRequestBuilders.get(signIn)
                            .param("userId", "test")
                            .param("userPwd", "12124")
            )
                    .andExpect(MockMvcResultMatchers.status().is5xxServerError)
                    .andExpect(MockMvcResultMatchers.content().string(BecauseOf.ACCOUNT_NOT_EXIST.getMsg()))
                    .andDo(MockMvcResultHandlers.print())
        }
    }

    @Nested
    @DisplayName(value = "회원 가입")
    open inner class SignUpTest {
        @Test
        @Transactional
        @Rollback(value = true)
        @Throws(Exception::class)
        open fun success() {
            val signUpRequest = SignUpRequest()
            signUpRequest.userId = "test"
            signUpRequest.userPwd = "1212"
            mockMvc!!.perform(
                    MockMvcRequestBuilders.post(signUp)
                            .characterEncoding(StandardCharsets.UTF_8)
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(mapper.writeValueAsString(signUpRequest))
            )
                    .andExpect(MockMvcResultMatchers.status().isOk)
                    .andExpect(MockMvcResultMatchers.header().exists(Constants.TOKEN_NAME))
                    .andDo(MockMvcResultHandlers.print())
        }
    }

}