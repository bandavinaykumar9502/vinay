package com.gratsit.strings;

class B{
	   
		private int num;
	   B(int num){
		   this.num=num;
	   }
	   public B setNum(int num){
		   return new B(num);
	   }
	   public int getNum() {
		   return num;
	   }
	}

	public class ImmutableDemo2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			B b1=new B(100);
			System.out.println("::"+b1.getNum());
			b1.setNum(300);
			System.out.println("::"+b1.getNum());
		}
	}
