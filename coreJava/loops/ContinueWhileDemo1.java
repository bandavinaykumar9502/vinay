public class ContinueWhileDemo1{
	
	public static void main(String[] args){
        System.out.println(":Start:");
        int j = 1; 
        while (j <= 5) {//1<=5, 2<=5, 3<=5 4
            if (j == 2) { // 1==2, 2==2, 3==2
                j++; //j=3
                continue; // Skip the rest of the code 
            }
            System.out.println("Iteration " + j); //1, 3, 4, 5
            j++;
        }	
		System.out.println(":End:");
	}
}