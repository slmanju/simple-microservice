package com.slmanju.servicea.service;

import com.slmanju.servicea.dto.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
class MessageClient {

    private final RestTemplate restTemplate;
    private final MessageClientFeign messageClientFeign;

    MessageClient(MessageClientFeign messageClientFeign) {
        this.messageClientFeign = messageClientFeign;
        this.restTemplate = new RestTemplate();
    }


    Message message() {
        return messageClientFeign.message();
    }

/*    Message message() {
        ResponseEntity<Message> responseEntity = restTemplate.getForEntity("http://localhost:7005/", Message.class);
        return responseEntity.getBody();
    }*/

}
