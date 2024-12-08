public class ReturnDemo1 {

		int method() {
			System.out.println(":Start:Inside method():");
			return 14;
		}
		
		int method(int k) {
			System.out.println(":Start:Inside method():");
			return k;
		}
		
					
		void method1() {
			System.out.println(":Start:Inside method1():");
			//return 45;
			return;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(":Start:main():");
			ReturnDemo1 obj=new ReturnDemo1();
			obj.method();
			obj.method(15);
			obj.method1();

			System.out.println(":End:main():");
		}
}