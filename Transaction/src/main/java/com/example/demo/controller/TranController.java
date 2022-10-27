package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TranService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class TranController {

	@Autowired
	TranService tranServ;
	
	@GetMapping("tran")
	public Transaction getTran()
	{
		log.info("CUSTOM log INFO GETTRAN");
		return tranServ.getServ();
	}
	
	@GetMapping("error")
	public void getTranError()
	{
		log.info("CUSTOM log INFO GETTRAN ERROR");
		int i = 10 / 0;
	}
	
	@PostMapping("tran")
	public String postTran()
	{
		log.debug("CUSTOM log DEBUG POST TRAN");
		return tranServ.postServ();
	}
	
	@PutMapping("tran")
	public String putTran()
	{
		log.warn("CUSTOM log warning put tran");
		return tranServ.putServ();
	}
	
	@DeleteMapping("tran")
	public String delTran()
	{
		log.error("CUSTOM log error delete tran");
		return tranServ.delServ();
	}
}
