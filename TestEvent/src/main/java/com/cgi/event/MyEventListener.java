package com.cgi.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyEventListener.class);

    @Async
    @EventListener(condition = "#event.messageData.length() <= 10")
    public void handle(MessageEvent event) {
        // long time running ...
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("handling event: {}, currentThread: {}", event, Thread.currentThread());
    }
}