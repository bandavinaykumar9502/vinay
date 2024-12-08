class EmployeeDemo{
	int id;
	String name;
	double salary;
	String companyName;
	
	EmployeeDemo(){
		System.out.println(":Constructor:Start:");
		id=123;
		name="ramesh";
		salary=5000.00;
		companyName="GratsIT";
		System.out.println(":Constructor:End:");
	}
}

class ConstructorDemo{

	public static void main(String[] args){
	
		EmployeeDemo employee1=new EmployeeDemo();
		EmployeeDemo employee2=new EmployeeDemo();
		
		System.out.println(":Employee 1:id:"+employee1.id+":name:"+employee1.name+":salary:"+employee1.salary+":companyName:"+employee1.companyName);
		System.out.println(":Employee 1:id:"+employee2.id+":name:"+employee2.name+":salary:"+employee2.salary+":companyName:"+employee2.companyName);
	
	}
	
}