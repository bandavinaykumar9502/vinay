package com.grats.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		System.out.println(":dt:"+dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
		String formattedDate = sdf.format(dt);
		System.out.println("Formatted Date: " + formattedDate);// dd/mm/yyy  mm dd yyyy
	}
}
