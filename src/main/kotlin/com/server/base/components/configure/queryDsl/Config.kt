package com.server.base.components.configure.queryDsl

import com.querydsl.jpa.JPQLQueryFactory
import com.querydsl.jpa.impl.JPAQueryFactory
import com.server.base.components.configure.msg
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Configuration(value = "querydsl_configuration")
class Config {
    @PostConstruct
    public fun enabled() {
        val configuration = "QueryDSL";
        msg(configuration);
    }

    @PersistenceContext
    private lateinit var entityManager: EntityManager;

    @Bean
    public fun jPQLQueryFactory(): JPQLQueryFactory {
        return  JPAQueryFactory(entityManager);
    }
}