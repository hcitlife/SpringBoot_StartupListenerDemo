package com.hc;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("applicationRunner args: ");
        System.out.println("applicationRunner args: ");
        System.out.println(args.getOptionValues("name"));
        System.out.println(args.getOptionValues("password"));
    }
}
