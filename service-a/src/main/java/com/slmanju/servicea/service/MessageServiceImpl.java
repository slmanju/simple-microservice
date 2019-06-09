package com.slmanju.servicea.service;

import com.slmanju.servicea.dto.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageClient messageClient;

    public MessageServiceImpl(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    @Override
    public Message message() {
        Message message = messageClient.message();
        StringBuilder builder = new StringBuilder();
        builder.append("Message from A -> ")
                .append("Hello from Service A")
                .append(" | ")
                .append("Message from B -> ")
                .append(message.getText());
        return new Message(builder.toString());
    }

}
