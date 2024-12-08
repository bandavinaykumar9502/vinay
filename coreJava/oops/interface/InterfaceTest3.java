		interface A{
			float rate=4.5f;
			String bankName="Axis";
			
			//int fdRate; This is not possible because we should initialize the variables in interfaces.
			
			void printBalance();
			void printStatement();
		}
			
			interface Address{
				int pincode=517501;
				String address="Hyderabad";
				void printAddress();
			}
			
			class C implements A, Address{
				public void printBalance(){
					System.out.println(50000);
				}
				
				public void printStatement(){
					System.out.println(":rate:"+rate);
					System.out.println(":bankName:"+bankName);
					System.out.println(":pincode:"+pincode);
				}	
				public void printAddress(){
					System.out.println("Bangalore");
				}
			}

			class InterfaceTest3{
				public static void main(String[] args){
					A a1=new C();
					//System.out.println(":rate:"+a1.rate+":bankName:"+a1.bankName);
					
					//a1.printBalance();
					//a1.printStatement();
					
					//System.out.println(":pincode:"+a1.pincode+":address:"+a1.address); //This is not possible
					//a1.printAddress();  //This is not possible
					
					Address addr=new C();
					System.out.println(":pincode:"+addr.pincode+":address:"+addr.address);
					addr.printAddress();
					
			//		System.out.println(":rate:"+addr.rate+":bankName:"+addr.bankName); This is not possible
			//		addr.printBalance(); This is not possible
			//		addr.printStatement(); This is not possible
				}
			}
