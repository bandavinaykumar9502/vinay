class Employee{
		int empId=101;
		double salary=20000;
		String deptId;

		public void printEmpDetl(){
			System.out.println(":empId:"+empId); //201
			System.out.println(":salary:"+salary); //200000
			System.out.println(":deptId:"+deptId); //null
		}
		public void printEmpId(){
			System.out.println(":empId:"+empId); //201
		}
}
class EmployeeDemo{
	public static void main(String[] args){
		int num1=1000;
		double num2=2000;
		Employee emp1=new Employee(); 
		emp1.salary=100000;
		Employee emp2=new Employee(); 
		emp2.empId=201;
		emp2.salary=200000;
		
		emp1.printEmpDetl();
		
		emp2.printEmpDetl();
		
	}
}