package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMsg(String msg)
	{
		System.out.println("Send output : " + kafkaTemplate.send("kafka-boot",msg));
	}
}
