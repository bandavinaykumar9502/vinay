public class ShiftOperators{
	public static void main(String[] args){
		int a = 5 ; //# binary: 0101
		int result = a<<3; //# binary: 0101000 =>40
		System.out.println(":result:"+result);
						
		int c = 5;  //# binary: 0101
		int result1 = a>>1; //# binary: 0010 =>2	
		int result2 = a>>2; //# binary: 0001 =>1	
		System.out.println(":result1:"+result1);
		System.out.println(":result2:"+result2);		
						
	}

}