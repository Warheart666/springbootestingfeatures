package com.example.springbootestingfeatures;

import org.springframework.stereotype.Component;

@Component("bean1")
public class Bean1 {


    public Bean1() {
        System.out.println("BEAN1");
    }
}
