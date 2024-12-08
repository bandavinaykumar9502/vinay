public class SwitchExample{
	public static void main(String[] args){		
		String grade = "H";
		switch (grade) {
			case "A":
				System.out.println("Excellent");
				break;
			case "B":
				System.out.println("Good");
				break;
			case "C":
				System.out.println("Satisfactory");
				break;
			default:
				System.out.println("Needs Improvement");
		}
	}

}
