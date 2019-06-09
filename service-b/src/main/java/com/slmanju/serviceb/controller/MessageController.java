package com.slmanju.serviceb.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = { "", "/", "/message"})
    public Message index() {
        return new Message("Hello from Service B :: " + port);
    }

    @Getter @Setter @AllArgsConstructor
    public class Message {
        private String text;
    }

}
