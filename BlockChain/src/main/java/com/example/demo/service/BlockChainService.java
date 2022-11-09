package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Block;
//import com.example.demo.repository.DataAccessObjectInterface;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Data
public class BlockChainService {

	@Value("${getBlockParameterValue}")
	String getBlockParameterValue;
	
	@Autowired
	Environment env;
	
//	@Autowired
//	DataAccessObjectInterface DAO;
	
	public Block getBlockFromService(String inputQuery) {

		log.info("CUSTOM LOG INFO from Service");
		return new Block(12233,inputQuery);
	}

	public String getBlockValue() {
		// TODO Auto-generated method stub
		return getBlockParameterValue;
	}

	public String getBlockEnv() {
		// TODO Auto-generated method stub
		return env.getProperty("getBlockParameterEnv");
	}
	
//	public String getMockData()
//	{
//		return DAO.getData();
//	}
	
	public int calculateCurrencyRate()
	{
		return 100;
	}
}
