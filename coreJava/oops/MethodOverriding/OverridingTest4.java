class A {
	String methodA(){
		System.out.println(":Inside class A methodA():");
		return null;
	}
	
}

class B extends A {
	Object methodA(){
		System.out.println(":Inside class B methodA():");
		return null;								
	}
	
}

public class OverridingTest4 {

	public static void main(String[] args){
		
		A refA=new B();
		refA.methodA();
	}
}