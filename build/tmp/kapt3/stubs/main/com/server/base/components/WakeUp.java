package com.server.base.components;

import java.lang.System;

@lombok.extern.slf4j.Slf4j()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/server/base/components/WakeUp;", "", "()V", "repository", "Lcom/server/base/repository/userRepository/UserRepository;", "message", "", "kotlinSpringBase"})
@org.springframework.stereotype.Component()
public class WakeUp {
    @org.springframework.beans.factory.annotation.Autowired()
    private com.server.base.repository.userRepository.UserRepository repository;
    
    public WakeUp() {
        super();
    }
    
    @org.springframework.context.event.EventListener(value = {org.springframework.boot.context.event.ApplicationReadyEvent.class})
    public void message() {
    }
}