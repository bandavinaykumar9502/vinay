class LaptopDetl{
	void printLaptop(Laptop obj){
		System.out.println(":printLaptop:id:"+obj.id+":name:"+obj.name);
	}
}
		
public class Laptop{
	int id;
	String name;
	void method1(){
		System.out.println(":Inside method1:");
		method2(this);
		//method2(new Laptop());
		LaptopDetl lopTopDetl=new LaptopDetl();
		
		lopTopDetl.printLaptop(this);
	}
	
	void method2(Laptop obj){
		System.out.println(":Inside method2:");
	}
	
	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.method1();
	}
}