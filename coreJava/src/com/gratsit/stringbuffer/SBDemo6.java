package com.gratsit.stringbuffer;

public class SBDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append("GratsIt").append(" Software").append(" Solutions").insert(8,"xyx").replace(10,11," ");
		
		System.out.println(sb);
	}

}
