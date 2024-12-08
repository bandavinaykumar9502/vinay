public class MethodOverloadingDemo1 {
	
	public void m1() {
		System.out.println(":No Arguments:");
	}
	
	public void m1(int i) {
		System.out.println(":int type:"+i);
	}
	
	public double m1(double k) {
		System.out.println(":double type:"+k);
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo1 object = new MethodOverloadingDemo1();
		object.m1();
		object.m1(500);
		object.m1(8888.999);
	}

}