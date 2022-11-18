package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataExportMain {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DataExportMain.class);

        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run();

        UserRepository userRepository = context.getBean(UserRepository.class);

        UserEntity user = new UserEntity();
        user.setId(1L);
        userRepository.save(user);

        System.out.println(userRepository.findAll());
    }
}
