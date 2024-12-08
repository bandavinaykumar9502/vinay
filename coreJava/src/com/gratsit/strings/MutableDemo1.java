package com.gratsit.strings;

class A{
	   private int num;
	   A(int num){
		   this.num=num;
	   }
	   public void setNum(int num){
		   this.num=num;
		   // return new A(a);
	   }
	   public int getNum() {
		   return num;
	   }
	}
	public class MutableDemo1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			A a1=new A(100);
			System.out.println("::"+a1.getNum());
			a1.setNum(300);
			System.out.println("::"+a1.getNum());
		}
	}
