package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Infra;
import com.example.demo.service.InfraService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class InfraController {
	
	@Autowired
	InfraService infraSrvc;
	
	@GetMapping("infra")
	public Infra getInfra()
	{
		log.info("CUSTOM LOG GET INFRA");
		return infraSrvc.getInfraSrvc();
	}
	
	@GetMapping("error")
	public void getInfraError()
	{
		log.info("CUSTOM LOG GET INFRA ERROR");
		int[] i = {1, 2};
		int j = i[4];
	}

	@PostMapping("infra")
	public String postInfra()
	{
		log.debug("CUSTOM LOG POST INFRA");
		return infraSrvc.postInfraSrvc();
	}
	
	@PutMapping("infra")
	public String putInfra()
	{
		log.warn("CUSTOM LOG PUT INFRA");
		return infraSrvc.putInfraSrvc();
	}
	
	@DeleteMapping("infra")
	public String delInfra()
	{
		log.error("CUSTOM LOG DELETE INFRA");
		return infraSrvc.delInfraSrvc();
	}
}
