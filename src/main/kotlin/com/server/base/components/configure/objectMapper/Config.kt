package com.server.base.components.configure.objectMapper

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.server.base.components.configure.msg
import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

@Configuration(value = "objectMapper_configuration")
@RequiredArgsConstructor
class Config {

    private lateinit var objectMapper: ObjectMapper;

    @PostConstruct
    public fun enabled() {
        val configuration = "ObjectMapper";
        msg(configuration);
    }

    private fun deserializeWhenEmptyCase() {
        this.objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        this.objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
    }
    private fun deserializeWhenUnknownCase() {
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private fun serializeDateTime() {
        this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
    }
    private fun deserializeWhenEnumCase() {
        this.objectMapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        this.objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
    }
    private fun deserializeRegisterJavaTimeModule() {
        objectMapper.registerModule( JavaTimeModule());
    }
    private fun deserializeSettings() {
        this.deserializeWhenEnumCase();
        this.deserializeWhenEmptyCase();
        this.deserializeWhenUnknownCase();
        this.serializeDateTime();
        this.deserializeRegisterJavaTimeModule();
    }

    private fun serializeSettings() {
        this.objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING,true);
        this.objectMapper.configure(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL,true);
        this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
    }

    private fun setJavaModule() {
        this.objectMapper.registerModule( JavaTimeModule());
    }

    @Bean
    public fun objectMapper (): ObjectMapper {
        this.objectMapper =  ObjectMapper();
        this.deserializeSettings();
        this.serializeSettings();
        this.setJavaModule();
        return this.objectMapper;
    }

}