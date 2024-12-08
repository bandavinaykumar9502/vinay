public class MethodSignatureDemo2{
	public int method1(int num1){
		System.out.println(":num1:"+num1);
		return num1;
	}
//	public void method1(int num2){			
//		System.out.println(":num2:"+num2);
//	}		//Compile Time Error method1(int) is already defined.
			// error: method method1(int) is already defined in class MethodSignatureDemo2
	public static void main(String[] args){
			MethodSignatureDemo1 obj=new MethodSignatureDemo1();
			obj.method1(200);
			obj.method1(500);
	}
}