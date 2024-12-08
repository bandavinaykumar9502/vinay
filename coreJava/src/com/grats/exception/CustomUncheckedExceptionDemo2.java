package com.grats.exception;

class AgeLimitException extends RuntimeException{
	public AgeLimitException(String errMsg){
		super(errMsg);
	}
}
public class CustomUncheckedExceptionDemo2 {
	private byte minAge=6;
	public void joinSchool(byte age) { //5
		if(minAge>age) { //6>5
			throw new AgeLimitException("You haven't meet the minimum Age criteria. Please come next year.");
		}else {
			System.out.println(":School Admission completed:");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":main:start:");
		CustomUncheckedExceptionDemo2 obj=new CustomUncheckedExceptionDemo2();
		obj.joinSchool((byte)5);
		System.out.println(":main:end:");
	}
}