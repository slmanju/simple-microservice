package com.slmanju.servicea.controller;

import com.slmanju.servicea.dto.Message;
import com.slmanju.servicea.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = { "", "/", "/message"})
    public Message index() {
        LOGGER.info("get message");
        return messageService.message();
    }

    @GetMapping(value = { "/hello"})
    public Message hello() {
        LOGGER.info("serving hello");
        return new Message("Hello Tracing");
    }

}
