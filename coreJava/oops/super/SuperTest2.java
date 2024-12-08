class D {
	D(){
		super();
		System.out.println(":Inside constructor D:");
	}
}

class E extends D {
	E(){
		super();
		System.out.println(":Inside constructor E:");
	}
	
}

class SuperTest2{
	public static void main(String[] args){
		E obj=new E();
	}
}