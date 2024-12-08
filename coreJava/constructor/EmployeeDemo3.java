class EmployeeDemo3{
		int id;
		String name;
		double salary;
		String companyName;
		
		EmployeeDemo3(int id,String name,double salary,String compName){
			System.out.println(":Constructor:Start:");
			this.id=id;
			name=name;
			salary=salary;
			companyName=compName;
			System.out.println(":Constructor:End:");
		}
		
	public static void main(String[] args){
		EmployeeDemo3 emp1=new EmployeeDemo3(3001,"Jashu",5000.00,"GratsIT");

		System.out.println(":id:"+emp1.id+":name:"+emp1.name+":salary:"+emp1.salary+":companyName:"+emp1.companyName); //3001, Jashu 5000 GratsIT
	}
}