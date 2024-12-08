public class PassByValueDemo1 {
	int method1(int marks1) {
		System.out.println(":2:In method1():marks1:"+marks1); //89
		marks1=99;
		System.out.println(":3:In method1():marks1:"+marks1); //99
		return marks1;
	}

	public static void main(String[] args) {
		int marks1=89;
		PassByValueDemo1 obj=new PassByValueDemo1();
		System.out.println(":1:In main():marks1:"+marks1); //89
		marks1=obj.method1(89);
		System.out.println(":4:In main():marks1:"+marks1); //99

	}
}