package java2;

import java.util.Scanner;

public class CircleCircumference {
	public static double circumference(int radius) {
		double result = 3.14*radius*radius;
		return result;	
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int radius = input.nextInt();
		//CircleCircumference obj=new CircleCircumference();
		double result=circumference(radius);
		System.out.println(result);
	}
}

