package com.rejo.contentcalendar.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rejo.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Controller

// this annotation don't run this method in dev profile
//@Profile("!dev")
@Component
public class DataLoader implements CommandLineRunner {
    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Hello");

    }
}
