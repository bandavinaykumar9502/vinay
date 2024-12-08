public class ReturnDemo3 {

		int method2() {
			System.out.println(":Start:Inside method2():");
			int k=1;
			for(;k<=100;k++) {
				System.out.print(" "+k);
				if(k==50) {
					System.out.println("");
					return k;
				}
			}
			System.out.println("");
			System.out.println(":End:Inside method2():");
			return k;
		}
		
		int method3() {
				System.out.println(":Start:Inside method2():");
				int k=1;
				for(;k<=100;k++) {
					System.out.print(" "+k);
					if(k==50) {
						System.out.println("");
						for(int j=0;j<10;j++) {
							System.out.print(" "+j);
							if(j==5) {
								System.out.println("");
								return j;
							}
						}
						
					}
				}
				System.out.println("");
				System.out.println(":End:Inside method2():");
				return k;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(":Start:main():");
			ReturnDemo3 obj=new ReturnDemo3();
			//obj.method2();
			int x=obj.method3();
			System.out.println(":x:"+x);
			System.out.println(":End:main():");
		}
}