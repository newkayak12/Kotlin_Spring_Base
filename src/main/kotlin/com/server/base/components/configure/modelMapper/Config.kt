package com.server.base.components.configure.modelMapper

import com.server.base.components.configure.msg
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@Configuration(value = "modelMapper_configuration")
class Config {

    private lateinit var modelMapper: ModelMapper;


    @PostConstruct
    fun enabled() {
        val configuration = "ModelMapper";
        msg(configuration)
    }

    private fun strictStrategy() {
        this.modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
    }
    private fun useReflection() {
        this.modelMapper.configuration.fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE
        this.modelMapper.configuration.isFieldMatchingEnabled = true;
    }

    @Bean
    fun modelMapper(): ModelMapper {
        modelMapper = ModelMapper()
        this.strictStrategy()
        this.useReflection()
        return modelMapper
    }
}