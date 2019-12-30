package com.hkk.toolsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.hkk")
@SpringBootApplication
public class ToolsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolsWebApplication.class, args);
    }

}
