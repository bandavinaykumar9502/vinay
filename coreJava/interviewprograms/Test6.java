class Laptop{
			int version; //555 777 777
			double cost;//200  255 310
			Laptop(int version,double cost){
				this.version=version;
				this.cost=cost;
			}
		}

		class Test6{
			
			void updateLaptop(Laptop b,double cost){ //,55
				b.version=777;
				b.cost=b.cost+cost;
			}
			public static void main(String[] args) {
				Laptop lp=new Laptop(555,200);
				Test6 t=new Test6();
				double newPrice=55;
				
				t.updateLaptop(lp,newPrice); 
				
				t.updateLaptop(lp,newPrice);
				
				System.out.println(":"+lp.version+":"+newPrice+":"+lp.cost); //777 55  310
			}
		}