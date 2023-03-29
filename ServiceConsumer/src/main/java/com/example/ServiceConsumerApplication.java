package com.example;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.Entity.User;
import com.example.Interface.UserInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ServiceConsumerApplication {

    @Reference
    private UserInterface userInterface;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServiceConsumerApplication.class);
        ServiceConsumerApplication application = context.getBean(ServiceConsumerApplication.class);
        User user = application.userInterface.queryUserById("");
        System.out.println(user);

    }
}
