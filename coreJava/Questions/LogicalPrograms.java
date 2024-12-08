public class LogicalPrograms{
	public static void main(String[] args){
		int a=7;
		int b=3;
		
		a = a+b; //a=10,b=3
		b = a-b; //b=7,a=10
		a = a-b;
		System.out.println(":a:"+a);
		System.out.println(":b:"+b);
		
		int x=5;
		x=x++;
		System.out.println(x); //5
		
		int y = 5;
		int z = ++y+y--; //x=6
						 
		System.out.println(":y:"+y); // 5
		System.out.println(":z:"+z); //12
		
		
		int e = 10;
		int f = 5;
		int g = e++ - --f * 2;
		
		System.out.println(":e:"+e); // 11
		System.out.println(":f:"+f); //4
		System.out.println(":g:"+g); //2
	}
	
}