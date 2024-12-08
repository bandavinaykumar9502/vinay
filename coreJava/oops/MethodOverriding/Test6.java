class Aa
{
	int i = 10;
	void method1(){
		System.out.println("In class Aa");
	}
}
 
class Bb extends Aa
{
	int i = 20;
	void method1(){
		System.out.println("In class Bb");
	}
}
 
public class Test6
{
	public static void main(String[] args)
	{
		Aa a = new Bb();
		System.out.println(a.i); //10 
		a.method1(); //In class Bb
		
	}
}