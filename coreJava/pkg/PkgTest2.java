//import controller.*;	// All the classes and interfaces of this package will be accessible but not subpackages.

import controller.AController;
import controller.BController;

class PkgTest2{
	public static void main(String[] args){
		AController obj1=new AController();
		BController obj2=new BController();
		System.out.println(":obj1:"+obj1);
		System.out.println(":obj2:"+obj2);
	}
}