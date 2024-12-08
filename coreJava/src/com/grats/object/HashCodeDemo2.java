package com.grats.object;

class Company{
	int compId;
	String compName;
	String address;
	public Company(int compId, String compName, String address) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}
	public int getCompId() {
		return compId;
	}
	public String getCompName() {
		return compName;
	}
	public String getAddress() {
		return address;
	}
	public int hashCode() {
		int results=56;
		final int prime = 31;//Multiplying the hash code by a prime number, such as 31, is a commonly used technique in Java for generating hash codes. The choice of 31 is not mandatory; it has some benefits that make it a popular choice
		results = prime * results + this.compId;
		results = prime * results + this.compName.hashCode();
		results = prime * results + this.address.hashCode();
		return results;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Company cmp=(Company)obj;
		if(this.compId==cmp.getCompId() && this.getCompName().equals(cmp.getCompName()) && this.getAddress().equals(cmp.getAddress())) {
			return true;
		}
		return false;
	}
}
public class HashCodeDemo2 {
	public static void main(String[] args) {
		Company comp1=new Company(5001,"Wipro","Bangalore");
		Company comp2=new Company(5001,"Wipro","Bangalore");
//		System.out.println(":1:"+comp1.hashCode());
//		System.out.println(":2:"+comp2.hashCode());
//		System.out.println(":2:"+comp2.equals(comp1));
		comp1.address="Hyderabad";
		System.out.println(":3:"+comp1.hashCode());
		System.out.println(":4:"+comp2.hashCode());
		comp1.address="Bangalore";
		System.out.println(":5:"+comp1.hashCode());
		System.out.println(":6:"+comp2.hashCode());
		comp1.compName="TCS";
		System.out.println(":7:"+comp1.hashCode());
		System.out.println(":8:"+comp2.hashCode());
	}
}