package com.springkafka.consumer;


import com.springkafka.kafka.models.Gretting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class MessageListner {
    public static  final Logger logger = LoggerFactory.getLogger(MessageListner.class);

    @KafkaListener(topics = "message-channel-x", groupId = "consumer-1")
    public void listenGroupFoo(Gretting gretting) {
        System.out.println("Received Message in group message-channel: " + gretting.toString());
    }

    @KafkaListener(topics = "message-channel-z", groupId = "consumer-1")
    public void listenGroupFoo(com.springkafka.kafka.models.Welcome welcome ) {
        System.out.println("Received Message in group message-channel-z: " + welcome.toString());
    }

}
