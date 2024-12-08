public class ContinueForDemo1{
	
	public static void main(String[] args){
	    System.out.println(":Start:");
        for (int i = 1; i <= 5; i++) {  //i=1, 1<=5, i=2,2<=5, 3 3<=5, i=4 4<=5
            if (i == 3) { //1==3,2==3 , 3==3 , 4==5
                // Skip the rest of the code for i == 3
                continue;
            }
            System.out.println("Iteration " + i); //1 ,2 , 4, 5
        }
		System.out.println(":End:");
	}
}