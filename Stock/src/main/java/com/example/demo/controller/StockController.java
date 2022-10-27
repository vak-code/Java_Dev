package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Stock;
import com.example.demo.service.StockService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@GetMapping("stock")
	public Stock getStock()
	{
		log.warn("CUSTOM get stock");
		return stockService.getStockServ();
	}
	
	@GetMapping("error")
	public void getStockError()
	{
		log.warn("CUSTOM get stock Error function");
		int i = 10 / 0;
	}
	
	@PostMapping("stock")
	public String postStock()
	{
		log.info("CUSTOM post stock");
		return stockService.postStockServ();
	}
	
	@PutMapping("stock")
	public String putStock()
	{
		log.error("CUSTOM put stock");
		return stockService.putStockServ();
	}
	
	@DeleteMapping("stock")
	public String delStock()
	{
		log.debug("CUSTOM delete stock");
		return stockService.delStockServ();
	}

}






