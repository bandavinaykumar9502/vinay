class Vehicle{
	byte noOfWheels;
	String color;
	float topSpead;
	
	void start(){
		System.out.println("Start");
	}
	void stop(){
		System.out.println("stop");
	}
}

class Bike extends Vehicle{
	String handClutch;
}

class Car extends Vehicle{
	String seatBelt;
}


class InheritanceTest2{
	public static void main(String[] args){
		Car car=new Car();
		System.out.println(":car.seatBelt:"+car.seatBelt);//null
		System.out.println(":car.seatBelt:"+car.noOfWheels);//0
		car.noOfWheels=4;
		car.color="Red";
		car.topSpead=200.00f;
		
		System.out.println(":car.seatBelt:"+car.noOfWheels);//4
		System.out.println(":car.seatBelt:"+car.color);//Red
		System.out.println(":car.seatBelt:"+car.topSpead);//200.00
		
		Bike bike=new Bike();
		System.out.println(":car.seatBelt:"+bike.handClutch);//null
		System.out.println(":car.seatBelt:"+bike.noOfWheels);//0
		bike.noOfWheels=2;
		bike.color="Yellow";
		bike.topSpead=100.00f;
		
		System.out.println(":bike.seatBelt:"+bike.noOfWheels);//2
		System.out.println(":bike.seatBelt:"+bike.color);//Yellow
		System.out.println(":bike.seatBelt:"+bike.topSpead);//100.00
		
		
	}
}