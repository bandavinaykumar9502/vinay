class Student{
	private int studentId;
	private String name;
	private double totalMarks;
	
	public void setStudenId(int studentId){
		this.studentId = studentId;
	}
	public int getStudenId(){
		return this.studentId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setTotalMarks(double totalMarks){
		this.totalMarks = totalMarks;
	}
	public double getTotalMarks(){
		return this.totalMarks;
	}
}

public class OopsTes1{
					
		void updateStudent(Student student){
			std.setStudenId(2001);
			std.setName("Rakesh");
			std.setTotalMarks(5656.56);
		}
		
		public static void main(String[] args){
			Student std=new Student();
			System.out.println(":studentId:"+std.getStudenId()+":name:"+std.getName()+":totalMarks:"+std.getTotalMarks());
			//
			
			//System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); 
			//std=std.getStudent(1002,"Venkat",444.50);
			//System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); //1002 Venkat 444.50
		}
}