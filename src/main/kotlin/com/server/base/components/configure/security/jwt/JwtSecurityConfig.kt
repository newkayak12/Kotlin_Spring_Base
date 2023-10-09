package com.server.base.components.configure.security.jwt

import com.server.base.components.configure.msg
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.security.config.annotation.SecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct


@Component(value = "JwtSecurityConfig")
@DependsOn(value = ["JwtFilter"])
@RequiredArgsConstructor
class JwtSecurityConfig:  SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>() {

    @Autowired
    private lateinit var jwtFilter: JwtFilter

    @PostConstruct
    fun enabled() {
        val configuration = "JwtSecurityConfig";
        msg(configuration);
    }

    override fun configure(builder: HttpSecurity?) {
        builder?.addFilterBefore(jwtFilter,  UsernamePasswordAuthenticationFilter::class.java);
    }
}