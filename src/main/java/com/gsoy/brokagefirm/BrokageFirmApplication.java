package com.gsoy.brokagefirm;

import com.gsoy.brokagefirm.model.request.RegisterRequest;
import com.gsoy.brokagefirm.services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.gsoy.brokagefirm.model.enums.Role.ADMIN;
import static com.gsoy.brokagefirm.model.enums.Role.MANAGER;

@SpringBootApplication
public class BrokageFirmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrokageFirmApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthenticationService service) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };

    }
}