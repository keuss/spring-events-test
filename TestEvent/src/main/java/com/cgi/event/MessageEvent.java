package com.cgi.event;

public class MessageEvent {

    private String messageData;

    public MessageEvent(String messageData) {
        this.messageData = messageData;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
                "messageData='" + messageData + '\'' +
                '}';
    }

    public String getMessageData() {
        return messageData;
    }
}
