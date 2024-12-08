public class MethodDemo1 {
	
	int id=1001;
	String name="Rajesh";
	String company="Grats IT";
	double salary=70000.00;
	
	void printEmployeeDetails(){ //method with no parameters
		System.out.println(":id:"+id);
		System.out.println(":name:"+name);
		System.out.println(":company:"+company);
		System.out.println(":salary:"+salary);
	}
	
	void printEmployeeName(){
		System.out.println(":name:"+name);
	}
	
	double getEmployeeSalary(){
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo1 obj=new MethodDemo1();
		obj.printEmployeeDetails();
		obj.printEmployeeName();
		System.out.println(":Salary:"+obj.getEmployeeSalary());
	}
}