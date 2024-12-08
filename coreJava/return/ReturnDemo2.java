public class ReturnDemo2 {

		void isEvenNumber(int num) {
				System.out.println(":Start:Inside method1():");
				if(num%2==0) {
					System.out.println(num+" is an even number");
					return;
				}else {
					System.out.println(num+" is an odd number");
				}
				System.out.println(":End:Inside method1():");
			}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(":Start:main():");
			ReturnDemo2 obj=new ReturnDemo2();
			obj.isEvenNumber(16);
			System.out.println(":End:main():");
		}
}