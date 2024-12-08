public class UnicodeDemo{
						
		public static void main(String[] args){
			//char ch='అ';
			//char ch1=3077;
			//char ch2='\u0C05';
			//System.out.println(":ch:"+ch);
			//System.out.println(":ch1:"+ch1);
			//System.out.println(":ch2:"+ch2);
			
			char ch3='A';
			char ch4=65;
			char ch5='\u0041';
			System.out.println(":ch3:"+ch3);
			System.out.println(":ch4:"+ch4);
			System.out.println(":ch5:"+ch5);
			
			String fileEncoding = System.getProperty("file.encoding");
			System.out.println(":file\tEncoding:"+fileEncoding);
		}
	
	}