package com.grats.BankDetailsByNumber.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Bank detals", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"Account Number"})
})
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sl_no")
	private long id;
	@Column(name = "Account Number", nullable=false)
	private String accountNumber;
	@Column(name = "Bank Name", nullable = false)
	private String bankName;
	
	
	public BankDetails(long id, String accountNumber, String bankName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
	}


	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
	
	
}
