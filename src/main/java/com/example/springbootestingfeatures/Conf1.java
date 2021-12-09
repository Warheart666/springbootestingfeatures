package com.example.springbootestingfeatures;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf1 {


    @Bean
    public Bean1 get() {
        return new Bean2();
    }


}
