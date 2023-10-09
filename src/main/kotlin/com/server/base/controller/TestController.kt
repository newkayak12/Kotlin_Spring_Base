package com.server.base.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal


@RestController
@RequestMapping(value = ["/api/v1/test"])
class TestController {

    @GetMapping
    fun test(principal: Principal): String? {
        return principal.name
    }
}