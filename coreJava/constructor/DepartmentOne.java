class DepartmentOne{
	int deptId;
	String deptName;
	
	DepartmentOne(int deptId,String deptName){
		System.out.println("1.:deptId:"+deptId+":deptName:"+deptName); //3001 Accounts
		System.out.println("2.:this.deptId:"+this.deptId+":this.deptName:"+this.deptName); //0 nulll
		
		deptId=deptId; //
		deptName=deptName;
		
		
		System.out.println("3.:deptId:"+deptId+":deptName:"+deptName); //3001 Accounts
		System.out.println("4.:this.deptId:"+this.deptId+":this.deptName:"+this.deptName); //0 null
		
		this.deptId = deptId;
		this.deptName = deptName;
		
		System.out.println("5.:this.deptId:"+this.deptId+":this.deptName:"+this.deptName); //3001 Accounts

	}
	
	public static void main(String[] args){
		DepartmentOne dept=new DepartmentOne(3001,"Accounts");
		System.out.println(":deptId:"+dept.deptId+":name:"+dept.deptName); //3001 Accounts
	}
}