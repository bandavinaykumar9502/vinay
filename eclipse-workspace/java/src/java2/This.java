package java2;

public class This{
	This(int a, int b){
		this.mult();
		int sum;
		sum=a+b;
		System.out.println(a+b);
	}
	This(){
		this(12,22);
		System.out.println("First Constructor");
	}
	int mult(){
		int x = 23;
		int y = 2;
		int multiply = x*y;
		System.out.println(multiply);
		return multiply;

	}
	public static void main(String[] args){
	This obj=new This();
	System.out.println("End");
	}
}


