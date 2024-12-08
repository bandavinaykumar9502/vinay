public class BreakWhileDemo1{
	
	public static void main(String[] args){
			System.out.println(":Start:");
			int i = 0;
			while (i < 10) { //0<10,
				System.out.println(":i:"+i);//0,
				if (i == 5) {
					//break; // exits the loop when i is 5
				}
				i++;
				System.out.println(":i:"+i);
			}
			System.out.println(":End:");
	}
}