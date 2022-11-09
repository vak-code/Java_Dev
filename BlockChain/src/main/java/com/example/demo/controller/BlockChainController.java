package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Block;
import com.example.demo.service.BlockChainService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@Data
//@CrossOrigin(origins="http://www.vishalkolekar.com")
public class BlockChainController {

	@Autowired
	BlockChainService blockChainService;
	
	@GetMapping("block")
	public ResponseEntity<Block> getBlock(@RequestParam(value="query", required=false) String queryString)
	{
//		int[] a = new int[2];
//		a[3] = 10;
		log.info("CUSTOM LOG INFO from controller");
		return new ResponseEntity<Block>(blockChainService.getBlockFromService(queryString),HttpStatus.OK);
	}
	
	@GetMapping("blockValue")
	public String getBlockValue()
	{
		log.info("CUSTOM LOG INFO from controller getBlockValue");
		return blockChainService.getBlockValue();
	}
	
	@GetMapping("blockEnv")
	public String getBlockEnv()
	{
		return blockChainService.getBlockEnv();
	}
	
	@GetMapping("block/{id}")
	public String getPath(@PathVariable int id)
	{
		return "The path variable is "+id;	
	}
	

	
}
