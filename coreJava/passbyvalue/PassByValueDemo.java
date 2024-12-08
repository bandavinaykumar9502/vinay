public class PassByValueDemo {

	void method1(int id,double marks) { //id=1001 marks=150.50
		System.out.println(":2:In method1():id:"+id+":marks:"+marks); //1001 150.50
		id=3001;
		marks=350.50;
		System.out.println(":3:In method1():id:"+id+":marks:"+marks);//3001 350.50
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=1001;
		double marks=150.50;
		System.out.println(":1:In main():id:"+id+":marks:"+marks);//1001 150.50
		
		PassByValueDemo obj=new PassByValueDemo();
		obj.method1(id, marks);
		System.out.println(":4:In main():id:"+id+":marks:"+marks);//1001 150.50
	}
}