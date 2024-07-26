package com.grats.BankDetailsByNumber.Service;


import com.grats.BankDetailsByNumber.Entity.BankDetails;


public interface BankService {

	public BankDetails saveDetails(BankDetails bankdetails);
	public BankDetails getDetails(String accountNumber);
}
