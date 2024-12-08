class ReturnDemo5{

	public static void main(String[] args){
		Company comp;
		Student std;
		comp = new Company();
		comp.compName="GratsIT";
		comp.location="Bangalore";
		System.out.println(":compName:"+comp.compName+":location:"+comp.location); //
		
		Company compOne=new Company();
		System.out.println(":compName:"+compOne.compName+":location:"+compOne.location); //
		compOne = comp;
		System.out.println(":compName:"+compOne.compName+":location:"+compOne.location);//
	}
}