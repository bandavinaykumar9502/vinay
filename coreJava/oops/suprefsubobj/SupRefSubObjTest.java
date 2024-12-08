		   class A{
				int x=100;
				void funA() {
					System.out.println(":Inside class A funA():");
				}
			}
			
			class B extends A{
				int y=200;
				void funB() {
					System.out.println(":Inside class B funB():");
				}
				
			}

			class C extends B{
				int z=300;
				void funC() {
					System.out.println(":Inside class C funC():");
				}
			}
		
			public class SupRefSubObjTest {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					A refA;
					refA = new B();
					refA = new C();
					
					refA.funA();
					System.out.println("::"+refA.x);
					
				//	refA.funB(); //This is not possible because can't access child class properties and methods from parent reference
				//	refA.funC(); 
					
					//System.out.println(":refA.x:"+refA.x);
					
			//		System.out.println(":refA.x:"+refA.y);// This is not possible because can't access child class properties and methods from parent reference
				//	System.out.println(":refA.x:"+refA.z);
				}
			}