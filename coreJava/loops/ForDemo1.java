public class ForDemo1{
	public static void main(String[] args){
		System.out.println(":Start:");
		
		for(int i=10;i>=1;i--){// i=10, i=9,9>=1,i=8,8>=1.....i=1,i=0,0>=1
			System.out.println(":i:"+i);//10,9,8.....1 
		}
		System.out.println(":End:");
	}
}