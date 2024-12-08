package com.gratsit.am.constructors;

public class Company {
	public String cmpName="Wipro";
	public String address="Bangalore";
	public int noOfEmployees=1000;
	
	public Company() {
	}
	
	protected Company(String cmpName){
		this.cmpName=cmpName;
	}
	
	Company(int noOfEmployees){
		this.noOfEmployees=noOfEmployees;
	}

	private Company(String cmpName,String address,int noOfEmployees) {
		this.cmpName=cmpName;
		this.address=address;
		this.noOfEmployees=noOfEmployees;
	}
	
	public static void main(String[] args) {
		Company comp1=new Company();
		System.out.println(":comp1:"+comp1);
		
		Company comp2=new Company("Infosys");
		System.out.println(":comp2:"+comp2);
		
		Company comp3=new Company(20000);
		System.out.println(":comp3:"+comp3);
		
		Company comp4=new Company("Grats","Bangalore",2000);
		System.out.println(":comp4:"+comp4);
	}
}
