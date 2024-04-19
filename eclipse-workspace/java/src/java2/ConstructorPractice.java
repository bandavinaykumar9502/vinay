package java2;

public class ConstructorPractice {
	String name;
	public ConstructorPractice() {
		 name ="Unknown";
		 System.out.println(name);
	}
	public ConstructorPractice(String s) {
		 name = s;
		 System.out.println(name);
	}
	
	public static void main(String[] args) {
		ConstructorPractice a = new ConstructorPractice();
		ConstructorPractice b = new ConstructorPractice("vinay");

	}

}
