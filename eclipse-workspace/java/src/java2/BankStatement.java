package java2;

import java.util.Scanner;

public class BankStatement {
	int balance_2,balance_1;
	public void sourcebank() {
		Scanner first = new Scanner(System.in);
		System.out.println("please enter the source account name");
		String name_1 = first.nextLine();
		System.out.println("please enter the source account number");
		double account_1= first.nextDouble();
		 balance_1 = 25000;
		System.out.println(" Available balance is Rs."+balance_1);
		System.out.println("Axis Bank");
	
	}
	public void beneficiary() {
		Scanner second = new Scanner(System.in);
		System.out.println("please enter the beneficiary account name");
		String name_2 = second.nextLine();
		System.out.println("please enter the beneficiary account number");
		double account_2 = second.nextDouble();
		balance_2 = 40000;
		System.out.println("Available balance is Rs."+balance_2);
		System.out.println("HDFC Bank");
	}
	public void processing() {
		Scanner conclusion = new Scanner(System.in);
		System.out.println("please enter the amount to transfer");
		int transfer_amount = conclusion.nextInt();
		int result_1 = balance_1-transfer_amount;
		int result_2 = balance_2+transfer_amount;
		System.out.println("The amount has been trasfered successfully");
		System.out.println("The Available amount in source account is Rs."+result_1);
		System.out.println("The Available amount in beneficiary account is Rs."+result_2);
	}
	public static void main(String[] args) {
		BankStatement obj_1 = new BankStatement();
		obj_1.sourcebank();
		obj_1.beneficiary();
		obj_1.processing();
	}
}
