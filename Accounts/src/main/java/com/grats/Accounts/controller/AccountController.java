package com.grats.Accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grats.Accounts.entity.AccountDetails;
import com.grats.Accounts.payLoad.AccountDto;
import com.grats.Accounts.service.MyService;

@RestController
@RequestMapping("/AccountDetails")
public class AccountController {
	
	@Autowired
	private MyService myService;
	
	
	@PostMapping("/saveaccount")
	public AccountDto saveAccount(@RequestBody AccountDetails accountDetails) {
		return myService.saveAccount(accountDetails);
		
	}
	
	@GetMapping("/accountNumber")
	public ResponseEntity<AccountDto> getCustomer(@PathVariable String accountNumber){
		return new ResponseEntity<AccountDto>(myService.getCustomer(accountNumber),HttpStatus.FOUND);
	}
	
}
