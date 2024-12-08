public class ExplicitTypeCasting {

	public static void main(String[] args) {
		  double num1 = 24234.43;
		  double num2 = 2.5;
		  int sum = (int) (num1 + num2);
		  System.out.println("::"+sum);
		  
		  double sum2= num1 + num2;
		  System.out.println(":sum2:"+sum2);
		  
		  char ch='8';
		  byte code=(byte)ch;
		  System.out.println(":code:"+code);
		  System.out.println(":ch:"+(int)ch);
		  
		  char ch1=56;
		  System.out.println(":ch1:"+ch1);
	}
}
