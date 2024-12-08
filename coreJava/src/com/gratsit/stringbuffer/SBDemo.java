package com.gratsit.stringbuffer;

public class SBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str=new String("Grats");
//		str.concat(" Software");
//		System.out.println(str);
//		
//		StringBuffer str1=new StringBuffer("Grats");
//		str1.append(" Software");
//		str1.insert(5, " asdfas ");
//		System.out.println(str1);
//		str1.delete(5, 13); //5, 12
//		System.out.println(str1);
//		str1.deleteCharAt(0);
//		System.out.println(str1);
//		
//		StringBuffer str2=new StringBuffer("Grats");
//		System.out.println(str2.reverse());
		
		StringBuffer str2=new StringBuffer("Grats Software");
		System.out.println(str2);
		str2.setLength(5);
		System.out.println(str2);
		System.out.println(str2.capacity());
		System.out.println(str2.length());
		str2.ensureCapacity(100000);
		System.out.println(str2.capacity());
		System.out.println(str2.length());
		str2.trimToSize();
		System.out.println(str2.capacity());
		System.out.println(str2.length());
	}

}
