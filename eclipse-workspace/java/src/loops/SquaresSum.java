package loops;

import java.util.Scanner;

public class SquaresSum {

	public void getsquare() {
		Scanner ref = new Scanner(System.in);
		int a = ref.nextInt();
		int sum=0;
		for (int i=1;i<=a;i++) {
			sum=sum+i*i;
		}
		System.out.println(sum);

	}
	public int getsquare1(){
		Scanner ref1 = new Scanner(System.in);
		int a = ref1.nextInt();
		int b = ref1.nextInt();
		int sum=0;
		for (;a<=b;a++) {
			sum=sum+a*a;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		SquaresSum obj = new SquaresSum();
		obj.getsquare();
		obj.getsquare1();
	}
}
