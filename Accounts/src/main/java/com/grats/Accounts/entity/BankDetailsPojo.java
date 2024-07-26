package com.grats.Accounts.entity;

public class BankDetailsPojo {

	private long id;
	private String accountNumber;
	private String bankName;
	public BankDetailsPojo(long id, String accountNumber, String bankName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
	}
	public BankDetailsPojo() {
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
