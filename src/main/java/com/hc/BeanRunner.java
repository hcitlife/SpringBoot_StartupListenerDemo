package com.hc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Configuration
public class BeanRunner {
    @Bean
    @Order(1)
    public CommandLineRunner runner1() {
        return args -> System.out.println("runner1 " + Arrays.toString(args));
    }

    @Bean
    @Order(2)
    public CommandLineRunner runner2() {
        return args -> System.out.println("runner2 " + Arrays.toString(args));
    }

    @Bean
    @Order(3)
    public CommandLineRunner runner3() {
        return args -> System.out.println("runner3 " + Arrays.toString(args));
    }
}
