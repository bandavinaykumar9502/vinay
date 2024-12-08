class D {
	D(){
		super();
		System.out.println(":Inside constructor D:");
	}
	D(int a,int b){
		super();
		System.out.println(":Inside constructor D(int,int):");
	}
}

class E extends D {
	E(){
		super(2432,234);
		System.out.println(":Inside constructor E:");
	}
	E(int a,int b){
		
		System.out.println(":Inside constructor E(int,int):");
	}
}

class SuperTest3{
	public static void main(String[] args){
		//E obj=new E(234,24);
		E obj=new E();
	}
}