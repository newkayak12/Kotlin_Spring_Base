package com.server.base.components.configure.security.properties.byPass

import lombok.Setter
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component(value = "security_properties")
@ConfigurationProperties("security")
@Setter
class ByPass {
    lateinit var ignorePath:  List<String>;

    fun ignoreSecurityPath( ): Array<String> {
        return ignorePath.toTypedArray()
    }
}