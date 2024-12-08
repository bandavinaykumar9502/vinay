public class DepartmentDemo1 {
		int deptId;
		String deptName;
					
		DepartmentDemo1(){
			System.out.println(":Inside DepartmentDemo():");
			this.deptId=3002;
		}
		
		DepartmentDemo1(int deptId,String deptName){
			this();
			System.out.println(":Inside DepartmentDemo(int,String):");
		}
		
		DepartmentDemo1(int deptId,String deptName,String companyName){
			
		}
		
		public static void main(String[] args) {
			
			DepartmentDemo1 obj=new DepartmentDemo1(1001,"IT");
			System.out.println(":deptId:"+obj.deptId+":deptName:"+obj.deptName); //3002 null
		}
}