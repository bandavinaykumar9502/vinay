public class DefaultValues {
	byte byteVar;      // 0
	short shortVar;    // 0
	int intVar;        // 0
	long longVar;      // 0
	float floatVar;    // 0.0
	double doubleVar;  // 0.0
	char charVar;      // '\u0000'
	boolean boolVar;   // false
	String name;		// null
	
	public void printDefaultValues(){
		System.out.println(":byteVar:"+byteVar);
		System.out.println(":shortVar:"+shortVar);
		System.out.println(":intVar:"+intVar);
		System.out.println(":longVar:"+longVar);
		
		System.out.println(":floatVar:"+floatVar);
		System.out.println(":doubleVar:"+doubleVar);
		System.out.println(":charVar:"+charVar);
		System.out.println(":boolVar:"+boolVar);
		
		System.out.println(":name:"+name);
		
	}
	
	public static void main(String[] args) {
		DefaultValues obj= new DefaultValues();
		obj.printDefaultValues();
	}
	
}