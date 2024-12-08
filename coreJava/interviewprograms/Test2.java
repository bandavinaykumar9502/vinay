public class Test2 {

	int k; //k=0 100 200
	int method1(int k){ //k=10
		this.k=this.k+k*k; //0+10*10 ==> 100 + 10*10 ==>
		return k;
	}
	public static void main(String[] args){
		int k=10;
		Test2 t=new Test2();
		//k=10
		System.out.println(t.method1(k));//10
		System.out.println(t.method1(k));//10
		System.out.println(t.k+k);//210
		
	}
}