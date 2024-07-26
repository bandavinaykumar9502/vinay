package com.grats.Accounts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.grats.Accounts.entity.AccountDetails;
import com.grats.Accounts.entity.BankDetailsPojo;
import com.grats.Accounts.feign.FeignClientDemo;
import com.grats.Accounts.payLoad.AccountDto;
import com.grats.Accounts.repo.AccountRepo;

import feign.Response;

@Service
public class ServiceImpl implements MyService {
	
	@Autowired
	private AccountRepo accountRepo;
	
	
	
	@Autowired
	private FeignClientDemo feignDemo;
	

	@Override
	public AccountDto saveAccount(AccountDetails accountDetails) {
		AccountDetails savedAccount = accountRepo.save(accountDetails);
		Response response = feignDemo.getByAccountNumber(savedAccount.getAccountNumber());
		String body = response.body().toString();
		System.out.println(body);
		Gson g = new Gson();
		BankDetailsPojo pojo = g.fromJson(body, BankDetailsPojo.class);
		
		AccountDto accountDto = new AccountDto();
		accountDto.setId(savedAccount.getId());
		accountDto.setName(savedAccount.getName());
		accountDto.setBalance(savedAccount.getBalance());
		accountDto.setAccountNumber(pojo.getAccountNumber());
		accountDto.setBankName(pojo.getBankName());
		return accountDto;
	}


	@Override
	public AccountDto getCustomer(String accountNumber) {
		AccountDetails details = accountRepo.findByAccountNumber(accountNumber);
		
		Response response=	feignDemo.getByAccountNumber(accountNumber);
		String body=response.body().toString();
		Gson g = new Gson();
		BankDetailsPojo pojo = g.fromJson(body, BankDetailsPojo.class);
		AccountDto accountDto = new AccountDto();
		accountDto.setId(details.getId());
		accountDto.setName(details.getName());
		accountDto.setAccountNumber(details.getAccountNumber());
		accountDto.setBalance(details.getBalance());
		accountDto.setBankName(pojo.getBankName());
		return accountDto;
	}
	
	
	
	
		

}
