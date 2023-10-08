package com.server.base.components.configure.advice

import com.server.base.components.expcetions.CommonException
import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.IncorrectClaimException
import io.jsonwebtoken.MalformedJwtException
import io.jsonwebtoken.UnsupportedJwtException
import io.jsonwebtoken.security.SignatureException
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException

@Slf4j
@RestControllerAdvice
class ControllerAdvisor {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = [CommonException::class])
    fun internalServerExceptionHandler( exception: CommonException ): ResponseEntity<String> {
        exception.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.message)
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = [NoHandlerFoundException::class])
    fun noHandlerExceptionHandler( ): ResponseEntity<String> {
        return  ResponseEntity("잘못된 요청입니다.", HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ExceptionHandler(value = [MalformedJwtException::class, UnsupportedJwtException::class, SignatureException::class])
    fun illegalTokenExceptionHandler( e: Exception ): ResponseEntity<String> {
        e.printStackTrace();
        return ResponseEntity("올바르지 않은 토큰입니다.", HttpStatus.FORBIDDEN);
    }

    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = [IncorrectClaimException::class])
    fun invalidTokenExceptionHandler( e: Exception ): ResponseEntity<String> {
        e.printStackTrace();
        return  ResponseEntity(e.message, HttpStatus.UNAUTHORIZED);
    }
    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(value = [ExpiredJwtException::class])
    fun expiredTokenExceptionHandler( e: Exception ): ResponseEntity<String> {
        e.printStackTrace();
        return  ResponseEntity(e.message, HttpStatus.NOT_ACCEPTABLE);
    }

}