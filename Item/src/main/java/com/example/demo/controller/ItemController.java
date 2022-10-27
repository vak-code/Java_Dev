package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class ItemController {

	@Autowired
	ItemService itemSrvc;
	
	@GetMapping("item")
	public Item getItem()
	{
		log.info("custom log get item");
		return itemSrvc.getItemSrvc();
	}
	
	@GetMapping("error")
	public void getItemError()
	{
		log.info("custom log get item ERROR");
		int i = 10/0;
	}
	
	@PostMapping("item")
	public String postItem()
	{
		log.debug("custom log post item");
		return itemSrvc.postItemSrvc();
	}
	
	@PutMapping("item")
	public String putItem()
	{
		log.warn("custom warn put item");
		return itemSrvc.putItemSrvc();
	}
	
	@DeleteMapping("item")
	public String delItem()
	{
		log.error("custom error delete item");
		return itemSrvc.delItemSrvc();
	}
}
