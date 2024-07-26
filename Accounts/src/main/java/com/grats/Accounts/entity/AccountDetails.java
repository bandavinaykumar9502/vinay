package com.grats.Accounts.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Account Details", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "Account Number" })
})
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private long id;
	
	@Column(name = "Name", nullable = false)
	private String name;
	

	@Column(name= "Account Number", nullable = false, length = 10, unique = true)
	private String accountNumber;
	
	@Column(name = "Available Balance", nullable = false)
	private long balance;
	
	
	
	

	public AccountDetails(long id, String name, String accountNumber, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if(accountNumber!=null && accountNumber.length()==10) {
			this.accountNumber = accountNumber;
		}else {
			throw new IllegalArgumentException("Account Number must be 10 characters long");
		}
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	
}
