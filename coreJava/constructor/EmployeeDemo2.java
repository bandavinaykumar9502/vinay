class Employee2{
	int id;
	String name;
	double 	;
	String companyName;
	
	Employee2(){
		System.out.println(":Constructor:Start:");
		id=123;
		name="ramesh";
		salary=5000.00;
		companyName="GratsIT";
		System.out.println(":Constructor:End:");
	}
	
	Employee2(int empId,String empName,double empSal,String compName){
		System.out.println(":Constructor:Start:"); //empId 3002, empName=Ramesh empSal=5000.00, compName=Infosys
		
		id=empId; id=3002
		
		name=empName; name=Ramesh
		
		salary=empSal; //salary=5000.00
		
		companyName=compName; //companyName=Infosys
		
		System.out.println(":Constructor:End:");
	}
}

class EmployeeDemo2{
	public static void main(String[] args){
		Employee2 emp1=new Employee2(3001,"Jashu",5000.00,"GratsIT");
		
		
		
		Employee2 emp2=new Employee2(3002,"Ramesh",5000.00,"Infosys");
		
		
		
		Employee2 emp3=new Employee2(4001,"Dinesh",7000.00,"Wipro");
		
		System.out.println(":Employee 1:id:"+emp1.id+":name:"+emp1.name+":salary:"+emp1.salary+":companyName:"+emp1.companyName);
		System.out.println(":Employee 2:id:"+emp2.id+":name:"+emp2.name+":salary:"+emp2.salary+":companyName:"+emp2.companyName);
		System.out.println(":Employee 3:id:"+emp3.id+":name:"+emp3.name+":salary:"+emp3.salary+":companyName:"+emp3.companyName);
		
		Employee2 emp4=new Employee2();
		Employee2 emp5=new Employee2();
		System.out.println(":Employee 4:id:"+emp4.id+":name:"+emp4.name+":salary:"+emp4.salary+":companyName:"+emp4.companyName);
		System.out.println(":Employee 5:id:"+emp5.id+":name:"+emp5.name+":salary:"+emp5.salary+":companyName:"+emp5.companyName);

	}
}