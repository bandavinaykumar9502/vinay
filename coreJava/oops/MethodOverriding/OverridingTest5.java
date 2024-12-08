class E {
	double methodA(){
		System.out.println(":Inside class A methodA():");
		return 1;
	}
	
}

class F extends E {
	double methodA(){
		System.out.println(":Inside class B methodA():");
		return 1;								
	}
	
}

public class OverridingTest5 {

	public static void main(String[] args){
		
		E refE=new F();
		refE.methodA();
	}
}