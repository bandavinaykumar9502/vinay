class P{
		void assets(){
			System.out.println(":HOUSE, LAND & CASH:");
		}
		
		void bike(){
			System.out.println(":In Class P: Hero Splendor Plus:");
		}
		
		void ride(){
			System.out.println(":In class P ride():");
		}
	}
	
	class C extends P{
		//void ride(){
		//	System.out.println(":In class C ride():");
		//}
		void bike(){
			System.out.println(":In Class C:Sports Bike:");
		}
	}
	
	public class OverrideTest{
		public static void main(String[] args){
			P p1=new P();
			//p1.bike();
			
			C c1=new C();
			///c1.bike();
			
			P p2=new C();
			//p2.bike(); 
			
			// compile time checks is the bike() present in Parent class or not and at run time jvm checks is the method overriding in child class or not if it overriding then it calls child class method.
			//This concept is called Run time polymorphism or Dynamic Polymorphism or Late Binding.
			//JVM is executing method based on Run time Object.
			
			p2.ride();
			
		}
	}