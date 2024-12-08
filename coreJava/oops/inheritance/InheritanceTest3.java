class Engine {
		void start() {
			System.out.println("Engine is starting.");
		}
		void stop() {
			System.out.println("Engine is stopping.");
		}
	}
	
	class Vehicle2 {
		private Engine engine = new Engine();

		void start() {
			engine.start();
			System.out.println("Vehicle is starting.");
		}

		void stop() {
			engine.stop();
			System.out.println("Vehicle is stopping.");
		}
	}
	
	public class InheritanceTest3 {
		public static void main(String[] args) {
			Vehicle2 myCar = new Vehicle2();
			myCar.start();
			myCar.stop();
		}
	}