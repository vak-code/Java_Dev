package com.vishal.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vishal.classobjects.objects.Account;

public class AccountListToMap {

	public static void main(String[] args) {
		
		List<Account> acctList = new ArrayList<Account>();
		acctList.add(new Account(101,"SBA"));
		acctList.add(new Account(102, "LAA"));
		System.out.println("Acct List = ");  
		acctList.stream().forEach(System.out::println);
		
		Map<Integer, String> acctMap = acctList
				.stream().collect(Collectors.toMap(Account::getAcctID, Account::getAcctType));
		System.out.println(acctMap);
		
	}
}
