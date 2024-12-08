public class BreakSwitchDemo1{
	
	public static void main(String[] args){
			int dayOfWeek = 3;
			switch (dayOfWeek) {
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					//break;
				case 4:
					System.out.println("Wednesday");
					//break;
				// ...
				default:
					System.out.println("Other day");
					break;
			}
	}
}