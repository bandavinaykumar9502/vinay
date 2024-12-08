package com.pk.operators;

import java.util.Scanner;

public class AgeCalculator {
	
	static int currentYear=2024;
	static int currentMonth=02;
	static int currentDate=13;
	static int maxMonths = 12;
	
	static int calculateAgeYear(int year,int month,int date) {
		int ageYear = currentYear-year;
		if((currentMonth<month)||(currentMonth==month&&currentDate<date)) {
			--ageYear;
		}
		return ageYear;
	}
	
	static int calculateAgeMonth(int month,int date) {
		int ageMonth = 0;
		if(currentMonth>month) {
			ageMonth = currentMonth - month;
		}else if(currentMonth<=month) {
			ageMonth = maxMonths - month + currentMonth;
			if(currentDate<date) {
				ageMonth-=1;
			}else if(currentDate>=date) {
				ageMonth = 0;
			}
		}
//		else {
//			if(currentDate<date) {
//				ageMonth = maxMonths - month + currentMonth -1 ;
//			}
//		}
		return ageMonth;
	}
	
	static int calculateAgeDays(int date,int year) {
		int ageDays = 0;
		if(currentDate>date) {
			ageDays = currentDate - date;
		}else if(currentDate<date) {
			ageDays = getMaxDays(currentMonth-1,year) - date + currentDate;
		}
		return ageDays;
	}
	
	static int getMaxDays(int calendarMonth,int year) {
		int maxDays = 31;
		if(calendarMonth==4||calendarMonth==6||calendarMonth==9||calendarMonth==11) {
			maxDays = 30;
		}else if(calendarMonth==2) {
			maxDays = isLeapYear(year)? 29:28;
		}
		return maxDays;
	}
	
	static boolean isLeapYear(int year) {
		boolean flag=false;
		if((year%4==0 && year%100!=0)||(year%100==0&&year%400==0)) {
			flag = true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println("===================:Start:=======================");
		Scanner sc=new Scanner(System.in);
		System.out.println(":Enter Date of Birth in DD:");
		int date=sc.nextInt();
		System.out.println(":Enter Month of Birth in MM:");
		int month=sc.nextInt();
		System.out.println(":Enter Year of Birth in YYYY:");
		int year=sc.nextInt();

		int ageYear = calculateAgeYear(year,month,date);
		int ageMonth = calculateAgeMonth(month,date);
		int ageDays = calculateAgeDays(date,year);
		
		System.out.println(":age is:"+ageYear+" Years "+ageMonth+" Months "+ageDays+" Days");
		
		System.out.println("=====================:End:=====================");
	}

}
