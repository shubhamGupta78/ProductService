package com.scaler.com.scaler.ProductService.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateFile {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }
}
