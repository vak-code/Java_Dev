package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

import antlr.collections.List;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
@RequestMapping(value="/resp")
public class BankControllerResponseEntity {
	
	@Autowired
	BankService bankSrvc;
	
//	@GetMapping("bank")
//	public Bank getBank()
//	{
//		log.info("Get Bank Info");
//		return bankSrvc.getBankSrvc();
//	}
	
	@GetMapping("/bank")
	public ResponseEntity<Bank> getBankResponseEntity(@RequestParam(value="sort", required=false) String sortOrder )
	{
		//Bank bank = bankSrvc.getBankSrvc();
		//ResponseEntity<Bank> responseEntity = new ResponseEntity<Bank>(bank,HttpStatus.OK);
		log.info("CUSTOM LOG Inside the ResponseEntityController");
		double res = 22/0;
		sortOrder.toUpperCase();
		log.info("SORT = " + sortOrder);
		//return responseEntity;
		return (new ResponseEntity<Bank>(bankSrvc.getBankSrvc(),HttpStatus.OK));
	}
	
//	@PostMapping("bank")
//	public String postBank()
//	{
//		log.debug("Post Bank Debug");
//		return bankSrvc.postBankSrvc();
//	}
	
	
//	@PostMapping("bank")
//	public ResponseEntity<String> postBank()
//	{
//		log.debug("Post Bank Debug");
//		//return bankSrvc.postBankSrvc();
//		return(new ResponseEntity<String>(bankSrvc.postBankSrvc(),HttpStatus.CREATED));
//	}
	
	@GetMapping("bank/{id}")
	public ResponseEntity<Optional<Bank>> getBank(@PathVariable Long id)
	{
		log.debug("custom log get bank using path variable");
		return new ResponseEntity<Optional<Bank>>(bankSrvc.getBankId(id), HttpStatus.OK);
	}
	
	@GetMapping("banks")
	public ResponseEntity<java.util.List<Bank>> getBanks()
	{
		log.debug("Getting All the Banks from DB");
		return bankSrvc.getAllBanks();
	}
	
	@PostMapping("bank")
	public ResponseEntity<Bank> postBank(@RequestBody Bank bank)
	{
		log.debug("Post Bank Debug");
		//return bankSrvc.postBankSrvc();
		return(new ResponseEntity<Bank>(bankSrvc.createBank(bank),HttpStatus.CREATED));
	}
	
//	@PutMapping("bank")
//	public String putBank()
//	{
//		log.warn("Put Bank Warning");
//		return bankSrvc.putBankSrvc();
//	}
	
	@PutMapping("bank")
	public ResponseEntity<String> putBankObject(@RequestBody Bank bank)
	{
		log.warn("Put Bank Warning");
		return bankSrvc.putBankObjectService(bank);
	}
	
//	@DeleteMapping("bank")
//	public String deleteBank()
//	{
//		log.error("Delete Bank Error");
//		return bankSrvc.delBankSrvc();
//	}
	
	@DeleteMapping("bank/{id}")
	public ResponseEntity<String> deleteBankObject(@PathVariable Long id)
	{
		log.debug("Deleting Bank object from DB");
		return bankSrvc.deleteBankObjectService(id);
	}
}