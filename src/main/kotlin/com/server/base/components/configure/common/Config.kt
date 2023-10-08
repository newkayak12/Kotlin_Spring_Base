package com.server.base.components.configure.common

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration(value = "common")
class Config {
    @Bean
    public fun bCryptPasswordEncoder ():BCryptPasswordEncoder {
        return  BCryptPasswordEncoder();
    }
}