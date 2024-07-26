package com.grats.Accounts.service;

import com.grats.Accounts.entity.AccountDetails;
import com.grats.Accounts.payLoad.AccountDto;

public interface MyService {

	public AccountDto saveAccount(AccountDetails accountDetails);
		
	public AccountDto getCustomer(String accountNumber);
	
	
}
