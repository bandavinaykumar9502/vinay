public class AdditionTest{				
	public static void main(String[] args){
		int x=10;
		int z=14;
		Addition obj=new Addition();
		int result = obj.add(x,z);
		System.out.println(":result:"+result);
		
		x=2343;
		z=234324;
		result = obj.add(x,z);
		System.out.println(":result:"+result);
		
		String name="asdfasd";
		result = obj.add(name,z);
	}
}