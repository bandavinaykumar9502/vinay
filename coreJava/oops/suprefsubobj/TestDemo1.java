		class Y {
			Object methodY(int a,double b){
				System.out.println(":Inside class Y methodY():");
				return null;
			}
		}

		class Z extends Y{
			String methodY(int a,double b){
				System.out.println(":Inside class Z methodY():");
				return null;
			}
		}
		
		public class TestDemo1{
			public static void main(String[] args){
				Y  y1=new Z();
			}
		}
				