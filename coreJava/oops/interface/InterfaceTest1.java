		interface A{
			float rate=4.5f;
			String bankName="Axis";
			
			//int fdRate; This is not possible because we should initialize the variables in interfaces.
			
			void printBalance();
			void printStatement();
		}

		class B implements A{
			
			public void printBalance(){
				System.out.println(50000);
			}
			
			public void printStatement(){
				System.out.println(":rate:"+rate);
				System.out.println(":bankName:"+bankName);
				System.out.println("Statement");
			}
		}

		class InterfaceTest1{
			public static void main(String[] args){
				 //A a1=new A(); //We can't create the object for interface.
		
		
				A a1;
				a1=new B();
				
				System.out.println(":rate:"+a1.rate+":bankName:"+a1.bankName);
				
				
				a1.printBalance();
				a1.printStatement();
				a1.rate=560;// We can't re-initialize the inteface variables because which is final variables.
			}
		}