public class UserInfo{
	
	int userId;
	int marks;
	String name;
	float salary;
	
	public static void main(String[] args){
		
		//ClassName refName=new ClassName();
		
		UserInfo userInfo = new UserInfo();
		
		System.out.println(":userId:"+userInfo.userId);
		System.out.println(":marks:"+userInfo.marks);
		System.out.println(":name:"+userInfo.name);
		System.out.println(":salary:"+userInfo.salary);
	}

}