package com.server.base.components.configure.security

import com.server.base.components.configure.msg
import com.server.base.components.configure.security.jwt.JwtAccessDenialHandler
import com.server.base.components.configure.security.jwt.JwtAuthenticationEntryPoint
import com.server.base.components.configure.security.jwt.JwtSecurityConfig
import com.server.base.components.configure.security.properties.byPass.ByPass
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain
import javax.annotation.PostConstruct


@EnableWebSecurity(debug = true )
@Configuration(value = "security_configuration")
@DependsOn(value = ["JwtAuthenticationEntryPoint", "JwtAccessDeniedHandler", "JwtSecurityConfig", "security_properties"] )
@RequiredArgsConstructor
class Config {

    @Autowired private lateinit var jwtAuthenticationEntryPoint: JwtAuthenticationEntryPoint
    @Autowired private lateinit var jwtAccessDeniedHandler: JwtAccessDenialHandler
    @Autowired private lateinit var jwtSecurityConfig: JwtSecurityConfig
    @Autowired private lateinit var byPass: ByPass


    @PostConstruct
    fun enabled() {
        val configuration = "Spring Security";
        msg(configuration);
    }


    @Bean
    fun configure( ): WebSecurityCustomizer {
        // * ==> spread operation
        return WebSecurityCustomizer {
            web: WebSecurity -> web.ignoring().mvcMatchers(*byPass.ignoreSecurityPath())
        }
    }

    @Bean
    fun filterChain (httpSecurity: HttpSecurity): SecurityFilterChain {
        return  httpSecurity
                .csrf().disable()
                .cors().and()
                .exceptionHandling { handler ->
                    handler.authenticationEntryPoint(jwtAuthenticationEntryPoint)
                    handler.accessDeniedHandler(jwtAccessDeniedHandler)
                }
                .sessionManagement { config ->
                    config.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                }

                .authorizeHttpRequests()
                .antMatchers(*byPass.ignoreSecurityPath()).permitAll()
                .anyRequest().authenticated()
                .and()

                .apply(jwtSecurityConfig)
                .and()
                .build()
    }

}

