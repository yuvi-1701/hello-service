package com.microservices.demo.hello.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> returnHello(){
        String traceID = UUID.randomUUID().toString();
        MDC.put("traceId", traceID);

        log.info("Recieved request with trace ID: {}", traceID);

        String response = "Hello";

        log.info("Response for traceID {} : {}", traceID, response);

        MDC.clear();
        return ResponseEntity.ok(response);
    }

}
