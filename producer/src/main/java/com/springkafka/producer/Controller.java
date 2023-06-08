package com.springkafka.producer;

import com.springkafka.kafka.models.Gretting;
import com.springkafka.kafka.models.Welcome;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final KafkaTemplate kafkaTemplate;

    public Controller(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/")
    public String send(@RequestBody() String message){
        Gretting gretting = new Gretting("Hi, Consumer", message);
        kafkaTemplate.send("message-channel-x",gretting);
        return "send";
    }

    @GetMapping("/channel-z")
    public String channelZ(@RequestBody() String message){
        Welcome welcome = new Welcome("Hi, Consumer", message);
        kafkaTemplate.send("message-channel-z",welcome);
        return "send";
    }
}
