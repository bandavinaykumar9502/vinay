import controller.AController;

class PkgTest1{
	public static void main(String[] args){
		AController obj=new AController();
		//System.out.println(":obj:"+obj);
		System.out.println(":obj.k:"+obj.k);
		obj.method1();
	}
}