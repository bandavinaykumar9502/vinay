package com.grats.object;

class Bank{
	int bankId;
	String name;
	String branch;
	public Bank(int bankId, String name, String branch) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.branch = branch;
	}
	
	public int getBankId() {
		return bankId;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Bank bnk=(Bank)obj;
		if(this.getBankId()==bnk.getBankId() && this.getName().equals(bnk.getName()) && this.getBranch().equals(bnk.getBranch())) {
			return true;
		}
		return false;
	}
}
public class EqualsDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ramesh",1001,"Sales");
		Bank bank1=new Bank(3001,"SBI","Bangalore");
		Bank bank2=null;
//		System.out.println(":bank1:"+bank1.equals(emp1));
		System.out.println(":bank1:"+bank1.equals(bank2));
		
//		Bank bank3=bank2;
//		System.out.println(":bank1:"+bank3.equals(bank2));
	}
}