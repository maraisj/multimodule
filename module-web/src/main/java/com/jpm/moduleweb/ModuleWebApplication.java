package com.jpm.moduleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.jpm.*"})
@ComponentScan(basePackages = {"com.jpm.*"})
public class ModuleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleWebApplication.class, args);
    }

}
