package com.pk.loops;

import java.util.Scanner;

public class CalendarDemo {
	
	Scanner sc = new Scanner(System.in);
	
	boolean isLeapYear(int year) {
		boolean flag=false;
		if((year%4==0 && year%100!=0)||(year%100==0&&year%400==0)) {
			flag = true;
		}
		return flag;
	}
	
	byte getMaxDays(int calendarMonth,int year) {
		byte maxDays = 31;
		if(calendarMonth==4||calendarMonth==6||calendarMonth==9||calendarMonth==11) {
			maxDays = 30;
		}else if(calendarMonth==2) {
			maxDays = isLeapYear(year)? (byte)29:(byte)28;
		}
		return maxDays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarDemo calendarDemo = new CalendarDemo();
		System.out.println(":Please Enter Calendar Year:");
		
		int year = calendarDemo.sc.nextInt();
		System.out.println(":Please Enter Calendar Month:");
		
		byte calendarMonth = calendarDemo.sc.nextByte();
		System.out.println(":Please Enter Start Week Day No Of Month:");
		byte weekDayNo = calendarDemo.sc.nextByte();
		
		byte daysInMonth = calendarDemo.getMaxDays(calendarMonth,year);
		
		byte date=1;
		
		
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		
		boolean flag = true;
		byte count = 1;
		
		while(date<=daysInMonth) {
			
			while(flag) {
				if(count==weekDayNo) {
					flag = false;
					break;
				}else {
					count++;
					System.out.print("\t");
				}
			}
			
			
			System.out.print(date+"\t");
			if((date+weekDayNo-1)%7==0) {
				System.out.println("");
			}
			date++;
		}
		
		calendarDemo.sc.close();
	}

}
