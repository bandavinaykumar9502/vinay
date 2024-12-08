import controller.*;	// All the classes and interfaces of this package will be accessible but not subpackages.
import controller.impl.*;

class PkgTest3{
	public static void main(String[] args){
		AController obj1=new AController();
		BController obj2=new BController();
		CController obj3=new CController();
		System.out.println(":obj1:"+obj1);
		System.out.println(":obj2:"+obj2);
		System.out.println(":obj3:"+obj3);
	}
}	