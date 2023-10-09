package com.server.base.components.configure.security.cors

import com.server.base.components.configure.msg
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

import javax.annotation.PostConstruct

@Configuration(value = "cross_origin_configuration")
class Config {

    @PostConstruct
    fun enabled() {
        val configuration = "CorsConfig";
        msg(configuration);
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val config =  CorsConfiguration();

        config.allowCredentials = true;
        config.allowedOriginPatterns = listOf("*");
        config.allowedMethods = HttpMethod.values().map { httpMethod ->  httpMethod.name }.toList();
        config.allowedHeaders = listOf("*");
        config.exposedHeaders = listOf("*");

        val source =  UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source
    }
}