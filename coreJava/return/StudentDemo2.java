class StudentDemo2{
		int studentId;
		String name;
		double totalMarks;
		
		void updateStudent(StudentDemo2 std){
			//Student std;
			std.studentId=std.studentId+100; //0+100
			std.name="Jashu";
			std.totalMarks=454.55+10;
		}
		public static void main(String[] args){
			StudentDemo2 std=new StudentDemo2();
			System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); //
			
			std.updateStudent(std); 
			System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks);//
			std.updateStudent(std);
			System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks);//
		}
	}