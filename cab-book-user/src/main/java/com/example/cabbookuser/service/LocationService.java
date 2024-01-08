package com.example.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    //suppose to listen to the messages, so
    //we have to create the kafka listener
    //listen to the topic of producer to receive the data from it
    @KafkaListener(topics = "cab-location", groupId = "${spring.kafka.consumer.group-id}")
    public void cabLocation(String location){
        System.out.println(location);
    }
}
