public class MethodOverloadingDemo3 {


	
	public void method2(String str) {
		System.out.println(":str:"+str);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo3 obj=new MethodOverloadingDemo3();
		//obj.method2(10);
		//obj.method2(20.50f);
		
		obj.method2('H');
		//obj.method2(30l);
		//obj.method2(40.50);
		
	}
}