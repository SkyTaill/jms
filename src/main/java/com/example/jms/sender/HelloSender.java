package com.example.jms.sender;


import com.example.jms.model.HellowWorldMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static com.example.jms.config.JmsConfig.MY_QUEUE;

@Component
@RequiredArgsConstructor
public class HelloSender {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper objectMapper;

    @Scheduled(fixedRate = 5000)
    public void sendMessage(){
        HellowWorldMessage message = HellowWorldMessage.builder().message("Hello").build();
        jmsTemplate.convertAndSend(MY_QUEUE,message);
    }
}
