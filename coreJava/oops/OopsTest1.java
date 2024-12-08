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

public class OopsTest1{
					
		void updateStudent(Student student){
			
			student.setStudenId(2001);
			student.setName("Rakesh");
			student.setTotalMarks(5656.56);
		}
		
		void updateStudentDetl(Student student){
			student = new Student();
			student.setStudenId(3001);
			student.setName("Naresh");
			student.setTotalMarks(7676.76);
		}
		
		Student getStudent(Student student){
			student = new Student();
			student.setStudenId(5001);
			student.setName("Ramesh");
			student.setTotalMarks(8989.89);
			return student;
		}
		
		public static void main(String[] args){
			Student std=new Student();
			System.out.println(":studentId:"+std.getStudenId()+":name:"+std.getName()+":totalMarks:"+std.getTotalMarks());
			//0 null 0.0
			
			OopsTest1 obj=new OopsTest1();
			obj.updateStudent(std);
			System.out.println(":studentId:"+std.getStudenId()+":name:"+std.getName()+":totalMarks:"+std.getTotalMarks());
			//2001 Rakesh 5656.56
			
			obj.updateStudentDetl(std);
			System.out.println(":studentId:"+std.getStudenId()+":name:"+std.getName()+":totalMarks:"+std.getTotalMarks());//
			
			std = obj.getStudent(std);
			System.out.println(":studentId:"+std.getStudenId()+":name:"+std.getName()+":totalMarks:"+std.getTotalMarks());//
			
			//System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); 
			//std=std.getStudent(1002,"Venkat",444.50);
			//System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); //1002 Venkat 444.50
		}
}