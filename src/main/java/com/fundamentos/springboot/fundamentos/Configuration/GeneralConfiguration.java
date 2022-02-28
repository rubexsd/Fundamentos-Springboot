package com.fundamentos.springboot.fundamentos.Configuration;

import com.fundamentos.springboot.fundamentos.Bean.MyBeanWithPropertiesimplements;
import com.fundamentos.springboot.fundamentos.Bean.iMyBeanWithProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.lastname}")
    private String lastname;

    @Value("${value.random}")
    private String random;

    @Bean
    public iMyBeanWithProperties function(){

        return new MyBeanWithPropertiesimplements(name,lastname);
    }
}
