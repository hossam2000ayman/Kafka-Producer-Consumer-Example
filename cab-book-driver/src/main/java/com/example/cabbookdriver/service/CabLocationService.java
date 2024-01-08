package com.example.cabbookdriver.service;

import com.example.cabbookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String , Object> kafkaTemplate;


    public boolean updateLocation(String location){
                            //topic-name , value
        kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
        //I am not creating the topic, but the spring will make autoconfiguration to create this topic


        return true;

    }
}
