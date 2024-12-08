public class MethodSignatureDemo1{
	
	
	public int method1(int num1){
		System.out.println(":num1:"+num1);
		return num1;
	}

	public void method2(String name){
		System.out.println(":name:"+name);
	}
	public static void main(String[] args){
			MethodSignatureDemo1 obj=new MethodSignatureDemo1();
			obj.method1(200);
			obj.method2("sadf");
			//obj.method1(600.50);

	}
}