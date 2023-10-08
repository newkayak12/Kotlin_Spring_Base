package com.server.base.components.configure.swagger

import com.server.base.components.configure.msg
import com.server.base.components.constants.Constants
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import javax.annotation.PostConstruct

@Configuration(value = "swagger_configuration")
@DependsOn(value = ["constants"])
class Config {

    @PostConstruct
    public fun enabled() {
        val configuration = "Swagger 3.0";
        msg(configuration);
    }

    @Bean
    fun openApi(): OpenAPI {
        val openAPI = OpenAPI()
        openAPI.components = Components().securitySchemes(
                mapOf(
                        "bearer-key" to SecurityScheme().type(SecurityScheme.Type.HTTP)
                                                        .scheme("bearer")
                                                        .bearerFormat("JWT")
                )
        )
        openAPI.info = this.apiInfo()
        return openAPI
    }

    private fun apiInfo(): Info {
        return  Info()
                .title("Base Server Swagger")
                .description("Base Server Swagger")
                .version("1.0");
    }
}