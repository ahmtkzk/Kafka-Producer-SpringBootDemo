package com.example.demo;

import com.example.demo.service.ProducerService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    private final ProducerService service;

    public DemoApplication(ProducerService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String json = "Demo message to topic";
        service.sendMessage(json);

    }

}
