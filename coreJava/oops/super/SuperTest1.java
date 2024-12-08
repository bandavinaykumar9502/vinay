	class A {
		int x = 10;
		int y = 55;

		void display() {
			System.out.println("display in A");
		}
	}

	class B extends A {
		int x = 20;
		//int y = 65;
		void display() {
			System.out.println("display() in B: ");
			System.out.println("x in B: " + x); //20
			System.out.println(":x of A: " + super.x); //10
			super.display();
		}
		//static void methodB() {
		//	System.out.println("in methodB()");
			//super.x;  super keyword can not be used in static methods. Also this keyword can not be used in static methods.
		//}
	}
	
	class C extends B{
		int y = 13;

		void methodC() {
			System.out.println("methodC() in C: ");
			System.out.println("y in B: " + y); //13
			System.out.println("y in B: " + super.y); //65
		}	
	}	

	class SuperTest1{
		public static void main(String[] args){
			B b1=new B();
			b1.display();
			C c1=new C();
			c1.methodC();
		}
	}