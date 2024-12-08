1. Question: swap these 2 variables without using temporary operator.
	int a=7;
	int b=3;
	
	a=3,b=7;
	
	a = a+b; //a=10,b=3
	b = a-b; //b=7,a=10
	a = a-b; //a=3,b=7

2. O/P of below code?
		int x=5;
		x=x++;
		sop(x); //5
		
3. O/P of below code?
		int x = 5;
		int y = ++x+x--; x=6
						 
		sop(":x:"+x); // 5
		sop(":y:"+y); //12

4. O/P of below code?
		int a = 10;
		int b = 5;
		int c = a++ - --b * 2;
		
		sop(":a:"+a); // 11
		sop(":b:"+b); //4
		sop(":c:"+c); //2

		
5. O/P of below code?
		int p = 5, q = 7, r = 10;
		p = ++q + r-- - p++;
		

6. int number = 15;
	int result = (number % 2 == 0) ?  ++number : number++;
	sop(":result:"+result); //15
	sop(":number:"+number); //16
	
7. Print the nearest odd number if the given number is even, print the same.
	

8.	O/P of below code?
		int result2= 1 + 5 * 3 ;
		sop(":result2:"+result2);
		
9.	O/P of below code?
		int result3 = 5 + 6 * 4 / 3 ;
		sop(":result3:"+result3); //13
		
10. Is the given year a leap year?


public class Test{

}

javac Test;

java Test;

Can we overload main method?

public class Test1{
	void main(String[] args){
	
	}
	public static void main(String[] args){
		System.out.println(":Inside main(args):");
	}
}

public class Test1{
	public static void main(String args){
	
	}
	public static void main(String[] args){
		System.out.println(":Inside main(args):");
	}
}

public class Test1{
	public static void main(String args){
	
	}
	public void main(String args){
	
	}
	public static void main(String[] args){
		System.out.println(":Inside main(args):");
	}
}

1. Number of primitive data types in Java are?

2. What is the size of float and double in java?

3.      

		short x = 10;
        x =  x * 5;
        System.out.print(x);
		
4.  Find the output of the following code.

		int 56a = 100;
		System.out.println("");

5. Find the output of the following code.

	if(1 + 1 + 1 + 1 + 1 == 5){
	  System.out.print("TRUE");
	}
	else{
	  System.out.print("FALSE");
	}

6.   Find the output of the following code.
		 int x = 5;
		 x*=(3+7);
         System.out.println(x);

7.     Find the output of the following code.

        int i;
        for(i = 1; i < 6; i++){ 
            if(i > 3) continue;
			
            System.out.println(i); //1 2 3
        }
        System.out.println(i);  //6
		
				 
8. 		Find the output of the following code.
		
		int count = 0;
		do{
			count++;
		  System.out.println("Hi");
		} while(count < 0);
		
		
9. 		for(;;) {
			System.out.println(":Hi:");
		}
		
		for(int i=0;i<1;i--){
			System.out.println(":Hi:");
		}
		
		for(int i=0;;i++){
			System.out.println(":Hi:");
		}
		
		

Assigntments:

1. Find the age of a person.
Assignment : Implement a method to find the average of 5 integers.

Assignment: Implement AccountManagement Application.

	=>Print Current Month Calendar
	
	 FEBRUARY, 2024
	 S  M  T  W TH  F  S
			     1  2  3  
	 4  5  6  7	 8  9 10 
	11 12 13 14 15 16 17 
	18 19 20 21 22 23 24
	25 26 27 28 29
	
Assignment : 
	1. Print prime numbers from 2 to 100
	2. Reverse the reverse of a given number
		input: 56089
		O/P	: 98065
		
***************
06-Mar-2024
***************
	
Question 1:
class A {
    public A() {
		super();
        System.out.println(":In A:");
    }
}
class B extends A {
    public B() {
    	this(10);
        System.out.println(":In B:");
    }
    B(int i){
		super();
    	System.out.println(":i:"+i);
    }
}
class C extends B {
    public C() {
		super();
        System.out.println(":In C:");
    }
}
public class Test1 {
    public static void main(String[] args) {
        B b = new C();
		//:In A:
		//:i:10
		//:In B:
		//:In C:
    }
}
Output:

Question 2:

class D {
    public D() {
		this("");
        System.out.print("Base ");
    }

    public D(String s) {
        System.out.print("Base: " + s);
    }
}
class E extends D {
    public E(String s) {
        super(s);
        System.out.print("Derived ");
    }
}

class Test2 {
    public static void main(String[] args) {
         D base = new E("Hello ");

		 //
		 //Base Hello Derived
    }
}

Question 3:

class Demo{
	public Demo(int i){
		System.out.println("int");
	}
	public void Demo(short s){
		System.out.println("short");
	}
}
public class Test3{	
	public static void main(String[] args){	
		short s = 10;
		Demo demo = new Demo(s);
	}		
}

Question 4:

class Aa
{
    int i = 10;
	void method1(){
		SOP("In class Aa");
	}
}
 
class Bb extends Aa
{
    int i = 20;
	void method1(){
		SOP("In class Bb");
	}
}
 
public class Test4
{
    public static void main(String[] args)
    {
        Aa a = new Bb();
        System.out.println(a.i); //10 
		a.method1(); //In class Bb
		
    }
}

Question 5:

class Xx
{
    public Xx(int i)
    {
        System.out.println(1);
    }
}
 
class Yy extends Xx
{
    public Yy()
    {
        System.out.println(":In Yy:");
    }
}
public class Test5
{
    public static void main(String[] args)
    {
        Xx xx = new Yy();
    }
}

Question 6:

class Cc
{
    public Cc(int i)
    {
		System.out.println(":In Cc:");
    }
}
class Dd extends Cc
{
 
}
public class Test6
{
    public static void main(String[] args)
    {
        Cc cc = new Dd();
    }
}
