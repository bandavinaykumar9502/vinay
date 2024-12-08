class Student{
		int id=1001;
		double marks=300;

		public void printStdDtl(){
			int x=20;
			int y=50;
			System.out.println(":x:"+x); //20
			System.out.println(":y:"+y); //50
		}
}
class StudentDemo{
	public static void main(String[] args){
		int num1=500;
		double num2;

		Student std1;  //reference variable
		Student std2;

		num2 = 700;

		std1 = new Student();
		std2 = new Student();
		
		std3 = new Student();

		std1.printStdDtl();
		std1.id=2001;	
		System.out.println(":std1:"+std1.id);//2001
		std1.id=6565;	

		System.out.println(":std1:"+std1.id);//6565
		System.out.println(":std2:"+std2.id);//1001
	}
}