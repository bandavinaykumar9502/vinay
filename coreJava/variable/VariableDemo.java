public class VariableDemo{
	byte marks;										// Variable declaration
	short mathsMarks, scienceMarks, socialStudiesMarks;	// Declares multiple variables
	char grade = 'B';        							// Declare & assign a value for single variable.
	int mathsMarks1 = 95, scienceMarks1 = 80;  			// Declare & assign a value for multiple variable.
	
	public static void main(String[] args){
		VariableDemo obj=new VariableDemo();
		System.out.println(":userId:"+obj.marks);
		System.out.println(":mathsMarks:"+obj.mathsMarks);
		System.out.println(":scienceMarks:"+obj.scienceMarks);
		System.out.println(":socialStudiesMarks:"+obj.socialStudiesMarks);
		
		System.out.println(":grade:"+obj.grade);
		
		System.out.println(":mathsMarks1:"+obj.mathsMarks1);
		System.out.println(":scienceMarks1:"+obj.scienceMarks1);
	}

}