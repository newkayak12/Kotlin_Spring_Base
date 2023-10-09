package com.server.base.controller

import com.server.base.components.expcetions.CommonException
import com.server.base.components.validations.AccountValid.SignIn
import com.server.base.components.validations.AccountValid.SignUp
import com.server.base.repository.dto.reference.AccountDto
import com.server.base.repository.dto.request.SignInRequest
import com.server.base.repository.dto.request.SignUpRequest
import com.server.base.service.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@Tag(name = "사용자 API", description = "사용자 관련 API")
@RestController
@RequestMapping(value = ["/api/v1/user"])
@RequiredArgsConstructor
class UserController {
    @Autowired
    private lateinit var service: UserService;


    @Operation(summary = "signIn")
    @GetMapping(value = ["/sign/in"])
    @Throws(CommonException::class)
    fun signIn(@ModelAttribute @Validated(value = [SignIn::class]) signInRequest: @Valid SignInRequest?, response: HttpServletResponse?): ResponseEntity<AccountDto?>? {
        return ResponseEntity<AccountDto?>(service.signIn(signInRequest, response), HttpStatus.OK)
    }

    @PostMapping(value = ["/sign/up"])
    @Throws(CommonException::class)
    fun signUp(@RequestBody @Validated(value = [SignUp::class]) signUpRequest: @Valid SignUpRequest?,
               request: HttpServletRequest?,
               response: HttpServletResponse?): ResponseEntity<AccountDto?>? {
        return ResponseEntity<AccountDto?>(service.signUp(signUpRequest, response), HttpStatus.OK)
    }

    @PostMapping(value = ["/refresh/token"])
    @Throws(CommonException::class)
    fun refreshAccessToken(
            @RequestHeader(value = "Refresh") refreshToken: String?,
            @ModelAttribute signInRequest: SignInRequest,
            response: HttpServletResponse?
    ): ResponseEntity<AccountDto?>? {
        signInRequest.refreshToken = refreshToken
        return ResponseEntity.ok(service.refreshAccessToken(signInRequest, response))
    }
}