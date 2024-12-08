public class LogicalOperators{
	public static void main(String[] args){
		
			boolean condition1 = true;
			boolean condition2 = false;
			boolean resultAnd = (condition1 && condition2);  // false
			boolean resultOr = (condition1 || condition2);   // true
			boolean resultNot = !condition1;
			
			System.out.println(":resultAnd:"+resultAnd);
System.out.println(":resultOr:"+resultOr);	
System.out.println(":resultNot:"+resultNot);	
			
			
			int a = 5;
			int b = 6;
			System.out.println("logical and stmt..."+( (a < b) && (a <= b)));		
		
	}

}