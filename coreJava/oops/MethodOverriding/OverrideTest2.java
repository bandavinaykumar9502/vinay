						class A {
							int methodA(){
								System.out.println(":Inside class A methodA():");
								return 0;
							}
							
							int methodB(){
								System.out.println(":Inside class A methodB():");
								return 0;
							}
						}
						
						class B extends A {
							int methodA(){
								System.out.println(":Inside class B methodA():");
								return 0;								
							}
							
						}
						
						class C extends B {
							int methodA(){
								System.out.println(":Inside class C methodA():");
								return 0;
							}
							int methodB(){
								System.out.println(":Inside class C methodB():");
								return 0;
							}
						}

				public class OverrideTest2{
					public static void main(String[] args){
						A refA = new C();
						refA.methodA();	
						
						C RefC = new C();
						RefC.methodB();
						
						B refB=new C();
						refB.methodB();
						

					}
				}