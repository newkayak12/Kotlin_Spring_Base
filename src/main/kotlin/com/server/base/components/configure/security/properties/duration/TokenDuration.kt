package com.server.base.components.configure.security.properties.duration

import lombok.Setter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component(value = "security_token_properties")
@ConfigurationProperties("jwt")
@Setter
class TokenDuration {

    val expireTime: Durations? = null

    fun getExpireTime(): Long {
        return this.expireTime?.time ?: Durations.HOUR_1.time
    }
}