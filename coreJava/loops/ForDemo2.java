public class ForDemo2{
	

	
//	void method1(int k){
//		System.out.println("====>:k:"+k);
//	}
	
//	void method1(int i){
//		System.out.println("====>:i:"+i);
//		System.out.println("====>:k:"+k);
//C:\Program Files\Java\jdk-1.8
//	}
	
	public static void main(String[] args){
		System.out.println(":Start:");
		for(int i=10;i>=1;){ //10>=1,9>=1,8>=1.....1>=1,0>=1
			System.out.println(":i:"+i);//10,9,8....1
			i--;
			//i=9,i=8,i=7,....i=0
		}
		
		System.out.println("====>:i:"+i);//0
		System.out.println(":End:");
	}
}