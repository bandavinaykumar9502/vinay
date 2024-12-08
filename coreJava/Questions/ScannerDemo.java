
import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){		
		//Scanner sc=new Scanner(System.in);
				
		System.out.println(":Start:");
		Scanner sc=new Scanner(System.in);
		System.out.println(":Enter a Number1:");
		int num1=sc.nextInt();
		System.out.println(":Enter a Number2:");
		int num2=sc.nextInt();
		System.out.println(":sum is:"+(num1+num2));
		System.out.println(":End:");
	}

}