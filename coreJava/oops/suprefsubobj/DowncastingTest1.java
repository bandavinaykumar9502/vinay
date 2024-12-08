public class DowncastingTest1 {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					A refA = new C();
					refA.funA();
					//refA.funB(); //This is not possible because can't access child class properties and methods from parent reference
					
					B refB=(B)refA;
					refB.funB();
					//refB.funC();
					
					C refC=(C)refA;
					refC.funC();
					
				}
			}