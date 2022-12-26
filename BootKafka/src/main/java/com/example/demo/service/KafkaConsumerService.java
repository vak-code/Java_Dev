package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics="kafka-boot",groupId="kafka-group-id")
	public void receiveMsg(String msg)
	{
		System.out.println("Msg received : " + msg);
	}
}
