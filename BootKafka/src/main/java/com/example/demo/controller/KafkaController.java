package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.KafkaProducerService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Data
@RequestMapping("/api")
public class KafkaController {

	@Autowired
	KafkaProducerService kafkaProducerService;
	
	@GetMapping("/kafkaMsg")
	public ResponseEntity<String> readMessage(@RequestParam(value="msg") String msg)
	{
		kafkaProducerService.sendMsg(msg);
		return new ResponseEntity<String>("Message processed sucessfully",HttpStatus.OK);
	}
}
