public class MethodOverloadingDemo2 {

	public void method2(int i) {
		System.out.println(":i:"+i);
	}
	
	public void method2(float j) {
		System.out.println(":j:"+j);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo2 obj=new MethodOverloadingDemo2();
		obj.method2(10);
		obj.method2(20.50f);
		
		obj.method2('H');
		obj.method2(30l);
		obj.method2(40.50);
		
	}
}