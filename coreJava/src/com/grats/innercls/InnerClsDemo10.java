package com.grats.innercls;

class College {
	 static String name="KMM";
	 String address="Tiruptahi";
	 College(){
		 System.out.println(":College:");
	 }
	 static class Student{
		int stdId=1001;
		String stdName="Rajesh";
		Student(){
			System.out.println(":Student:");
		}
		void printDetl() {
//			System.out.println(":address:"+address); //Outer class non-static variables can't access from static inner class.
			System.out.println(":name:"+name+":stdId:"+stdId+":stdName:"+stdName);
		}
	}
}

public class InnerClsDemo10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College.Student obj=new College.Student();
		obj.printDetl();
	}
}