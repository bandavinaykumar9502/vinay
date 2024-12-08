interface Aa{
	int i=200;
	void methodA1();
}

interface A2{
	int j=500;
	//int i=200;
	void methodA2();
}

interface Bb extends Aa,A2{
	int k=600;
	int j=700;
	int a=i;
	int b=j;
	//int c=super.j; This is not possible
	void methodB1();			
}

class Cc implements Bb{
	public void methodA1(){
		System.out.println("methodA1");
	}
	public void methodA2(){
		System.out.println("methodA2");
	}
	public void methodB1(){
		System.out.println("methodB1");
		System.out.println(":i:"+i+":j:"+j+":k:"+k+":a:"+a+":b:"+b);
	}
	public void methodC1(){
		System.out.println("methodC1");
	}
}

class InterfaceTest4{
	public static void main(String[] args){
		Bb bb1=new Cc();
		System.out.println(":i:"+bb1.i+":j:"+bb1.j+":k:"+bb1.k+":a:"+bb1.a+":b:"+bb1.b);
		bb1.methodA1();
		bb1.methodA2();
		bb1.methodB1();
		
		//bb1.methodC1(); //this is not possible
	}
}