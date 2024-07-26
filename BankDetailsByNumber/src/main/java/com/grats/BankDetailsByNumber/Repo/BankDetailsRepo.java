package com.grats.BankDetailsByNumber.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grats.BankDetailsByNumber.Entity.BankDetails;


public interface BankDetailsRepo extends JpaRepository<BankDetails, Long> {






	BankDetails findByAccountNumber(String accountNumber);


}
