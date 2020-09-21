package com.ayushi.colors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ApiConfiguration.class})
public class ColorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

}
