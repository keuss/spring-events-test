package com.cgi.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher publisher;

    public void create(String messageData) {
        LOGGER.info("handling messageData: {}, currentThread: {}", messageData, Thread.currentThread());
        publisher.publishEvent(new MessageEvent(messageData));
    }
}
