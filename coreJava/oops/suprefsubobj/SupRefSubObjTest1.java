public class SupRefSubObjTest1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			B refB;
			refB = new C();
			refB.funB();
			refB.funA();
			//refB.funC(); //This is not possible because can't access child class properties and methods from parent reference
			refB.x=101;
			refB.y=201;
			System.out.println(refB.x);
			System.out.println(refB.y);
			objB.z=301; //This is not possible because can't access child class properties and methods from parent reference
		}
}