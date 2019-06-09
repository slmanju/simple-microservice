package com.slmanju.servicea.controller;

import com.slmanju.servicea.dto.Message;
import com.slmanju.servicea.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = { "", "/", "/message"})
    public Message index() {
        return messageService.message();
    }

}
