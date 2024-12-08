class Test{
		int y; //0
		Test(int y){
			mult(y); //y=10
		}
		void mult(int y){//y=10
			this.y*=5;//this.y*=5 => this.y=this.y*5; 
		}
		public static void main(String[] args){
			int y=10;
			Test t=new Test(y);
			System.out.println(":y:"+y); //10
			System.out.println(":y:"+t.y); //50 0 
		}
	}