package com.grats.BankDetailsByNumber.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grats.BankDetailsByNumber.Entity.BankDetails;
import com.grats.BankDetailsByNumber.Repo.BankDetailsRepo;

@Service
public class BankServiceImpl implements BankService {
	
	
	@Autowired
	private BankDetailsRepo bankDetailsRepo;
	

	@Override
	public BankDetails saveDetails(BankDetails bankDetails) {
		BankDetails savedDetails = bankDetailsRepo.save(bankDetails);
		
		return savedDetails;
	}

	@Override
	public BankDetails getDetails(String accountNumber) {
		return bankDetailsRepo.findByAccountNumber(accountNumber);
	}

}
