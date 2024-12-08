public class ConditionalStatementsNestedIf{
	public static void main(String[] args){
			int x = 10;
			int y = 5;
			if (x > 5) {
				System.out.println("x is greater than 5");
				if (y > 2) {
					System.out.println("y is greater than 2");
				} else {
					System.out.println("y is not greater than 2");
				}
				System.out.println("==========>");
			} else {
				System.out.println("x is not greater than 5");
			}
	}
}