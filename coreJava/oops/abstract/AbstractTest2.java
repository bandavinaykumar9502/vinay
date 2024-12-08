abstract class Bank{
	  void printSavingsROI(){
		System.out.println(4.25);
	  }
	  abstract void printHomeLoanROI();
	  abstract void printCreditCardROI();
}

abstract class SBIBank extends Bank{  
	  void printHomeLoanROI(){
		System.out.println(9.5);
	  }
} // Here it should be an abstract class because not implementing all the abstract methods in child class.

class SBICard extends SBIBank{
  void printCreditCardROI(){
	System.out.println(36.50);
  }
}


class AbstractTest2{
	public static void main(String[] args){
		//Bank b1=new Bank();// This is not possible because you can't create the object of abstract class.
		Bank bank=new SBICard();
		
		bank.printSavingsROI();
		
		bank.printHomeLoanROI();
		
		bank.printCreditCardROI();
	}
}