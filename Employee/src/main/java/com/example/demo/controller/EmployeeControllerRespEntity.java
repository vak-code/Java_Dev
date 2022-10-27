package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RequestMapping(value="resp")
@RestController
public class EmployeeControllerRespEntity {

	@Autowired
	EmpService empService;
	
	@GetMapping("emp")
	public ResponseEntity<Employee> getEmployee(@RequestParam(value="sort", defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG RE Get Employee called with Query Param : " + sortOrder);
		return (new ResponseEntity<Employee>(empService.getEmpServ(),HttpStatus.OK));
	}
	
	@GetMapping("emp/{id}")
	public ResponseEntity<Employee> getEmployeePath(@PathVariable String id)
	{
		log.info("CUSTOM LOG RE Get Employee called with PATH : " + id);
		return (new ResponseEntity<Employee>(empService.getEmpServ(),HttpStatus.OK));
	}
	
	@GetMapping("emp/error")
	public void getEmployeePath()
	{
		log.info("CUSTOM LOG RE Get Employee ERROR called");
		int i = 22/0;
	}
	
	@PostMapping("emp")
	public ResponseEntity<String> postEmployee()
	{
		log.info("CUSTOM LOG RE POST Employee called ");
		return (new ResponseEntity<String>(empService.postEmpServ(),HttpStatus.CREATED));
	}
	
	@PutMapping("emp")
	public ResponseEntity<String> putEmployee()
	{
		log.info("CUSTOM LOG RE PUUT Employee called ");
		return (new ResponseEntity<String>(empService.putEmpServ(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("emp")
	public ResponseEntity<String> delEmployee()
	{
		log.info("CUSTOM LOG RE DELTE Employee called ");
		return (new ResponseEntity<String>(empService.delEmpServ(),HttpStatus.ACCEPTED));
	}
}
