class Bank{
		double getFdROI(int adj){
			System.out.println("Inside Bank getFdROI():");
			return 5.5;
		}				
	}

	class SBIBank extends Bank{  
		double getFdROI(int adj){
			System.out.println("Inside SBIBank getFdROI():");
			return 7.5;
		} 
	}

	class HDFCBank extends Bank{
		double getFdROI(int adj){
			System.out.println("Inside HDFCBank getFdROI():");
			return 6.6;
		} 
	}
	
	public class OverrideTest1{
		public static void main(String[] args){
		
			Bank bankRef = new Bank();
			double roi1=bankRef.getFdROI(1);
			System.out.println(":roi1:"+roi1);//5.5
			
			Bank bankRef2 = new SBIBank();
			double roi2=bankRef2.getFdROI(1);
			System.out.println(":roi2:"+roi2);	//7.5

			Bank bankRef3 = new HDFCBank();
			double roi3=bankRef3.getFdROI(1);
			System.out.println(":roi3:"+roi3);//6.6					
		}
	}