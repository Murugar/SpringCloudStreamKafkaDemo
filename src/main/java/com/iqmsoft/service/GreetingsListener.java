package com.iqmsoft.service;


import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.iqmsoft.model.MsgGreeting;
import com.iqmsoft.stream.GreetingsStreams;

@Component

public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload MsgGreeting greetings) {
       // log.info("Stream Listener Received greetings: {}", greetings);
    }
}
