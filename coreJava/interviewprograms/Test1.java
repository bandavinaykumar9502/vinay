public class Test1 {

	int k; // k=0; k=110, k=110
	int method1(int k){ //k=10 
		this.k=k+k*k; //10+10*10 ==> 110
		return k; //10
	}
	public static void main(String[] args){
		int k=10;
		Test1 t=new Test1();
		//k=10
		
		t.method1(k); //
		t.method1(k); //
		System.out.println(t.method1(k));//10  
		System.out.println(t.method1(k));//10
		System.out.println(t.k+k);//110+10 ==>120
	}
}