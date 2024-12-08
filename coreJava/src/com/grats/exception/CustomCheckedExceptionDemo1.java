package com.grats.exception;

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String errMsg){
		super(errMsg);
	}
}
public class CustomCheckedExceptionDemo1 {
	private double balance=10000.00;
	public void withdraw(double amount)throws InsufficientBalanceException {
		if(amount>balance) {
			throw new InsufficientBalanceException("You don't have sufficient funds in your account. Please check.");
		}else {
			balance-=amount;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":main:start:");
		CustomCheckedExceptionDemo1 obj=new CustomCheckedExceptionDemo1();
		try {
			obj.withdraw(20000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(":balance:"+obj.balance);
		System.out.println(":main:end:");
	}
}
