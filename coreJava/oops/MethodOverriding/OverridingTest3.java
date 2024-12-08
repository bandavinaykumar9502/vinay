class Y {
	void methodY(int a,double b){
		System.out.println(":Inside class Y methodY():");
	}
}

class Z extends Y{
	void methodY(int a,double b){
		System.out.println(":Inside class Z methodY():");
	}
}

public class OverridingTest3 {

	public static void main(String[] args){
		
		Y refY=new Z();
		refY.methodY(10,20.50);
	}
}