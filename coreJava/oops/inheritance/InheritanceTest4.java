class Calculator{
						double pi=3.14;
						
						int add(int num1,int num2){
							return num1+num2;
						}
						int sub(int num1,int num2){
							return num1-num2;
						}
					}
					
					class AdvCalculator extends Calculator{
						int x=100;
						int mult(int num1,int num2){
							return num1*num2;
						}
					}

					class SuperCalculator extends AdvCalculator{
						int y=200;
						double pi=3.14;
						super.pi;
						double power(int num1,int num2){
							return Math.pow(num1, num2);
						}
					}	

					class InheritanceTest4{
						public static void main(String[] args){
							SuperCalculator obj=new SuperCalculator();
							double num=obj.power(7,4);
							System.out.println(":num:"+num);
							int mul=obj.mult(343,34);
							System.out.println(":mul:"+mul);
						}
					}