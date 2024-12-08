public class BreakForDemo1{
	
	public static void main(String[] args){
		System.out.println(":Start:");
		for (int i = 1; i <= 10; i++) {  //i=1, 1<=10, i=2, 2<=10,...i=5 5<=10
			System.out.println(":i:"+i); //1 ,2 .... 5
			if (i == 5) { //1==5 , 2==5 ,...5==5
				break; // exits the loop when i is 5
			}
			System.out.println(":i:"+i); //1,2 ...
		}
		System.out.println(":End:");
	}
}