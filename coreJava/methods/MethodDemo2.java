public class MethodDemo2 {
			
	int a=100;
	

	int sum(int a,int b){
		System.out.println(":a:"+a);
		System.out.println(":b:"+b);
		return a+b;
	}

	int mult(int a,int b){
		System.out.println(":a:"+a);
		System.out.println(":b:"+b);
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 obj=new MethodDemo2();
		int sum=obj.sum(300,500);
		
		
		System.out.println(":sum:"+sum);
		int x=20;
		int y=30;
		int mult=obj.mult(x,y);
		System.out.println(":mult:"+mult);
	}
}
