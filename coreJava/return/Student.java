class Student{
						int studentId;
						String name;
						double totalMarks;
						
						Student getStudent(int studentId,String name,double totalMarks){
							Student std;
							std=new Student();
							std.studentId=studentId;
							std.name=name;
							std.totalMarks=totalMarks;
							
							return std;
						}
						public static void main(String[] args){
							Student std=new Student();
							System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks);//0 null 0.0
							
							
							std.getStudent(1001,"Rajesh",555.50);
							System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); //0 null 0.0
							std=std.getStudent(1002,"Venkat",444.50);
							System.out.println(":studentId:"+std.studentId+":name:"+std.name+":totalMarks:"+std.totalMarks); //1002 Venkat 444.50
						}
					}