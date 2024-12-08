class A{
	int i;
	void methodA(){
		System.out.println(":Inside class A methodA():");
		//System.out.println(":j:"+j); 
		System.out.println(":i:"+i); 
		//methodB();
	}
}

class B extends A{ 
	int j;
	void methodB(){
		System.out.println(":Inside class B methodB():");
		System.out.println(":j:"+j); //15
		System.out.println(":i:"+i); 
		methodA();
	}
}

class InheritanceTest1{
	public static void main(String[] args){
		B obj=new B();
		System.out.println(":obj.j:"+obj.j); //0
		System.out.println(":obj.i:"+obj.i); //0 // B class is extending A so can access members of a with B class object
		obj.i=14;
		obj.j=15;
		System.out.println(":obj.j:"+obj.j); //15
		System.out.println(":obj.i:"+obj.i); //14
		obj.methodB();
		obj.methodA();
	}
}