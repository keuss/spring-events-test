package com.cgi.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context.xml")
public class TestEvent {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestEvent.class);

    @Autowired
    MyEventPublisher myEventPublisher;

    @Test
    public void testEvent() throws InterruptedException  {

        LOGGER.info("Publishing event test...");
        myEventPublisher.create("foo");
        LOGGER.info("Finished publishing event test");
        Thread.sleep(5000);
    }
}
