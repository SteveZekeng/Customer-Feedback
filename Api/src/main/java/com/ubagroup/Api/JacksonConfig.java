package com.ubagroup.Api;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
public class JacksonConfig {
	
	@Bean
    public Jackson2ObjectMapperBuilderCustomizer customizeObjectMapper() {
        return jacksonObjectMapperBuilder -> 
            jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

}
