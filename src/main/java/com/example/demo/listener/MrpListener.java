package com.example.demo.listener;

import com.example.demo.entity.Person;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
class MrpListener {

    @JmsListener(destination = "people")
    public void onMessage(@Payload Person mrp) {
        System.out.println("Received <" + mrp + ">");
    }
}
