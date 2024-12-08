package com.gratsit.am.constructors;

public class CompanyImplSamePkg extends Company {
	CompanyImplSamePkg() {
		super();
//		 super("Infosys");
//		 super(5000);
//		 super("Wipro","Chennai",5000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyImplSamePkg obj = new CompanyImplSamePkg();
		System.out.println(":obj:" + obj);
	}

}
