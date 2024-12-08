public class DoWhileDemo1{
	public static void main(String[] args){
		System.out.println(":Start:");
		int i=1; 
		do{
			System.out.println(":Hi:"+i); //1,2,3....10
			//i++;
		}while(++i<=10); //i=2,2<=10,i=3,3<=10,....11<=10
		System.out.println(":End:");
	}
}



