package com.grats.Accounts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grats.Accounts.entity.AccountDetails;

public interface AccountRepo extends JpaRepository<AccountDetails, Long> {

	AccountDetails findByAccountNumber(String accountNumber);


}
