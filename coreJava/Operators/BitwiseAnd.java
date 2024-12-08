public class BitwiseAnd{
	public static void main(String[] args){
						boolean flag1=true;
						boolean flag2=true;
						boolean result = (flag1 & flag2); // false
						System.out.println(":result:"+result);
						
						int a=5;
						int b=7;
						int result1=(a&b);
						System.out.println(":result1:"+result1);
						
						
						boolean flag3=false;
						boolean flag4=false;
						boolean result2 = (flag3 | flag4);
						System.out.println(":result2:"+result2);
						
						int aa = 5 ; //# binary: 0101
						int bb = 7 ; //# binary: 0111
						
						int result3 = aa | bb;  //# binary: 0111   => 7
						System.out.println(":result3:"+result3);
						
						
						boolean flag5=true;
						boolean flag6=false;
						boolean resul5 = (flag5 ^ flag6); // true
						System.out.println(":resul5:"+resul5);
						
						int a1 = 5;  //# binary: 0101
						int b1 = 7;  //# binary: 0111
						int result4 = a1 ^ b1;  //# binary: 0010   => 2
						System.out.println(":result4:"+result4);
						
						
													
						//boolean result7=(~flag6); // Compile time error.
						
						
					    int a2=5;
						System.out.println(~a2); //-6
						
						
						
	}

}