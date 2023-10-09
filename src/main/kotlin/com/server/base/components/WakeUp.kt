package com.server.base.components

import com.server.base.repository.userRepository.UserRepository
import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
@Slf4j
class WakeUp {

    @Autowired
    private lateinit var repository: UserRepository

    @EventListener(value = [ApplicationReadyEvent::class])
    fun message() {

        println("{} is ready"+ repository!!.wakeUpMsg("base"))
    }
}