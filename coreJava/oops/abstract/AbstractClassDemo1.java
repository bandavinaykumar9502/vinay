
abstract class AbstractClassDemo1{
	int x=100;
	AbstractClassDemo1(){
		System.out.println(":Inside AbstractClassDemo1:");
	}
	
	public void methodA() {
		System.out.println(":methodA():");
	}
	
	
	public static void main(String[] args){
	
		//AbstractClassDemo1 obj=new AbstractClassDemo1(); Can't create abstract class object


		AbstractClassDemo1 obj=new AbstractClassDemo2();
		System.out.println(obj.x);
		
//		System.out.println(obj.y); Can't access child class property

//		obj.methodA();
//		obj.methodB();	Can't access child class method

	}
	
}

class AbstractClassDemo2 extends AbstractClassDemo1{
	int y=200;
	public void methodB(){
		System.out.println(":methodB():");
	}
}