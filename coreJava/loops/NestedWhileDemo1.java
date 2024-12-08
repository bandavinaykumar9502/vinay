public class NestedWhileDemo1{
	
	public static void main(String[] args){
		System.out.println(":Start:");
		int i = 1;
        // Outer while loop
        while (i <= 3) { //i=1,1<=3, i=2
            System.out.println("Outer Loop - Iteration " + i); //1,2
            int j = 1; 
            // Inner while loop
            while (j <= 4) { //j=1, 1<=4 , 2<=4, 3<=4, 4<=4, 5<=4
                System.out.println("  Inner Loop - Iteration " + j); //1, 2, 3, 4
                j++; // Increment inner loop counter 
				//j=2, j=3, j=4, j=5
            }
			
            i++; // Increment outer loop counter
			System.out.println("Outer Loop - End:"); //1,
        }
		System.out.println(":End:");
	}
}