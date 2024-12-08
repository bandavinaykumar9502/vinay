package com.pk.loops;

import java.util.Scanner;

public class AccountManagement {

	Scanner sc=new Scanner(System.in);
	
	public BankAccount captureBankAccount() {
		BankAccount bankAccount = new BankAccount();
		System.out.println(":Please Enter Account No:");
		bankAccount.accountNo = sc.nextInt();
		System.out.println(":Please Enter Account Holder Name:");
		bankAccount.accountName = sc.next();
		System.out.println(":Please Enter Balance:");
		bankAccount.balance = sc.nextDouble();
		System.out.println(":Please Bank Name:");
		bankAccount.bankName = sc.next();
		return bankAccount;
	}
	
	public boolean isFundsAvailable(BankAccount bankAccount,double amount) {
		if( bankAccount.balance<=0 || amount>bankAccount.balance) {
			return false;
		}
		return true;
	}
	
	public void transferFunds(BankAccount sorceBankAccount,BankAccount benBankAccount,double amount) {
		if(isFundsAvailable(sorceBankAccount,amount)) {
			sorceBankAccount.balance-=amount;
			benBankAccount.balance+=amount;
		}else {
			System.out.println(":You don't have sufficient funds to transfer:");
		}
	}
	
	public void displayBankAccount(BankAccount bankAccount) {
		System.out.println(":Account No:"+bankAccount.accountNo+":Account Holder Name:"+bankAccount.accountName+":Balance:"+bankAccount.balance+":Bank Name:"+bankAccount.bankName);
	}

	public void printBankAccount(BankAccount sorceBankAccount,BankAccount benBankAccount) {
		System.out.println("***** Source Account Details *****");
		displayBankAccount(sorceBankAccount);
		System.out.println("***** Beneficiary Account Details *****");
		displayBankAccount(benBankAccount);
		System.out.println(":======================================:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======================================");
		System.out.println("Welcome to Account Management System");
		System.out.println("======================================");
		
		AccountManagement accountManagement = new AccountManagement();
		
		System.out.println(":Please Enter Source Bank Account Details:");
		BankAccount sourceBankAccount = accountManagement.captureBankAccount();
		System.out.println(":Please Enter Baneficiary Bank Account Details:");
		BankAccount beneficiaryBankAccount = accountManagement.captureBankAccount();
		
		accountManagement.printBankAccount(sourceBankAccount, beneficiaryBankAccount);
		
		System.out.println(":Please Enter Ammount To Transfer:");
		double transferAmount = accountManagement.sc.nextDouble();
		
		accountManagement.transferFunds(sourceBankAccount,beneficiaryBankAccount,transferAmount);
		accountManagement.printBankAccount(sourceBankAccount, beneficiaryBankAccount);
		
		//Capature 3 bank account details
		//
		//deposit amount
		//withdraw amount
		//fund transfer
		
		accountManagement.sc.close();
		System.out.println(":======================================:");
		System.out.println(":Thank You:");
		System.out.println(":======================================:");
	}

}
