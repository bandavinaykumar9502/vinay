abstract class Bank{

	void printSavingsROI(){
	   System.out.println(3.5);
	}

	abstract void printPersonalLoanROI();
	

}

class SBIBank extends Bank{
	void printPersonalLoanROI(){
		System.out.println(10.5);
	}
}


class AbstractTest1{

	public static void main(String[] args){
		Bank bank=new SBIBank();
		bank.printSavingsROI();
		bank.printPersonalLoanROI();
	}
	
}

