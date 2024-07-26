package com.grats.Accounts.payLoad;


public class AccountDto {

	private long id;
	private String name;
	private String accountNumber;
	private long balance;
	private String bankName;
	public AccountDto(long id, String name, String accountNumber, long balance, String bankName) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.bankName = bankName;
	}
	public AccountDto() {
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
		this.accountNumber = accountNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
}
