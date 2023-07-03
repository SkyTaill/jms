package com.example.jms.listener;

import com.example.jms.model.HellowWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.example.jms.config.JmsConfig.MY_QUEUE;

@Component
public class HelloListener {

    @JmsListener(destination = MY_QUEUE)
    public void listenMessage(@Payload HellowWorldMessage hellowWorldMessage){
            System.out.println("-------");

            System.out.println(hellowWorldMessage.getMessage());
            System.out.println("-------");

    }
}
