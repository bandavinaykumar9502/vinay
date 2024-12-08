package com.gratsit.strings;

class C{
	private int x=100;
	C(int x){
		this.x=x;
	}
	public int getX() {
		return this.x;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		if(this.getX()==((C)obj).getX()) {
			return true;
		}
		return false;
	}
}

public class StringDemo7{
		public static void main(String[] args){
		
			C a1=new C(10);
			C a2=new C(10);
			System.out.println(a1==a2);
			System.out.println(a1.equals(a2));
		
			String s1=new String("Bangalore"); 	
			String s2=new String("Bangalore");	
			String s3="Bangalore"; 
			String s4="Bangalore";
			
			System.out.println(s1==s2);//false
			System.out.println(s1==s3); // false
			System.out.println(s1==s4); //false
			
			System.out.println(s1.equals(s2));//true
			System.out.println(s1.equals(s3));//true
			System.out.println(s1.equals(s4));//true
			
			System.out.println(s3==s4);//true
			System.out.println(s3.equals(s4)); //true
			

		}		
}
