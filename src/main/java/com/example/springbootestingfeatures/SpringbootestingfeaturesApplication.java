package com.example.springbootestingfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = @ComponentScan.Filter(value = Bean1.class, type = FilterType.ASSIGNABLE_TYPE))
public class SpringbootestingfeaturesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootestingfeaturesApplication.class, args);
    }

}
