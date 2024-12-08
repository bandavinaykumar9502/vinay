public class Computer{
		String computerName;
		Computer(String name){
			computerName=name;
		}
		public static void main(String[] args){
			Computer obj=new Computer("Grats");
			System.out.println(":obj:"+obj.computerName);
		}
}