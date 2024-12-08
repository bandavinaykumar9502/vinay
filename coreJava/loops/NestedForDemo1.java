public class NestedForDemo1{
	
	public static void main(String[] args){
		System.out.println(":Start:");
		
        for (int i = 2; i <= 10; i++) { // i=2, 2<=5,3<=5
        	System.out.println(i+" Table:"); //2 , 3 
            for (int j = 1; j <= 10; j++) { // j=1 , j=2 2<=10, 3 3<=10.... j=11, 11<=10
                System.out.println(":"+i+" X "+j+":  "+(i * j)); //  2*1= 2 2*2 =4, 2*3 6 .... 2*10 =20 
            }
        }
		
		System.out.println(":End:"); 
	}
}