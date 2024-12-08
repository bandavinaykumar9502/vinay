package com.grats.mapcollection;

import java.util.HashMap;

class Company {
	private int compId;
	private String compName;
	private String address;
	public Company(int compId, String compName, String address) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class HashMapDemo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMapObj = new HashMap();
		hashMapObj.put("1001", new Company(1001, "TCS", "Bangalore"));
		hashMapObj.put("456", new Company(456, "Wipro", "Bangalore"));
		hashMapObj.put("674", new Company(674, "HCL", "Bangalore"));
		hashMapObj.put("434", new Company(434, "Grats", "Bangalore"));
		hashMapObj.put("3443", new Company(3443, "Accenture", "Bangalore"));
		hashMapObj.put("3454", new Company(1001, "JKT", "Bangalore"));
		
		Company company = (Company)hashMapObj.get("434");
		System.out.println(":company:" + company);
		System.out.println(":compId:" + company.getCompId() + ":name:" + company.getCompName() + ":addresss:"
				+ company.getAddress());
		System.out.println(":hashMapObj:"+hashMapObj);

	}
}
