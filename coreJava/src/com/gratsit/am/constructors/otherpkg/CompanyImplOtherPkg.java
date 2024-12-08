package com.gratsit.am.constructors.otherpkg;

import com.gratsit.am.constructors.Company;

public class CompanyImplOtherPkg extends Company{

	CompanyImplOtherPkg(){
//		super();
//		super("Infosys");
//		super(5000);
//		super("Wipro","Chennai",5000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyImplOtherPkg obj=new CompanyImplOtherPkg();
		System.out.println(":obj:"+obj);
	}

}
