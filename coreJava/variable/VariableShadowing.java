public class VariableShadowing{
	static int a=19;
	int b = 20;
	
	public void methodA(){
		//int b=40;
		System.out.println(":b:"+b);
	}

	public static void main(String[] args){
		//int a=30;
		System.out.println(":a:"+a);
		
		VariableShadowing obj=new VariableShadowing();
		obj.methodA();
		
	}

}