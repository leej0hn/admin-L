package com.redscarf.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>function:
 * <p>User: leejohn
 * <p>Date: 16/7/8
 * <p>Version: 1.0
 */
@SpringBootApplication
@Slf4j
public class AdminWebApplication implements CommandLineRunner {

    @Value("${spring.application.name}")
    private String applicationName;


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(AdminWebApplication.class);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{} boot successfully", this.applicationName);
    }

}