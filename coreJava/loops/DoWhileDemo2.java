public class DoWhileDemo2{
	public static void main(String[] args){
		System.out.println(":Start:");
		int i=1; 
		do{ //i=2...10,11
			System.out.println(":Hi:"+i); //1,2...10,11
		}while(i++<=10); //i=1,1<=10....10<=10,i=11,11<=10
		System.out.println(":End:");
	}
}



