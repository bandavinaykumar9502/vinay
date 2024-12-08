public class EscapeSequenceDemo{
						
		public static void main(String[] args){
			
			String fileEncoding = System.getProperty("file.encoding");
			System.out.println(":file\tEncoding:"+fileEncoding);
			System.out.println(":file\nEncoding:"+fileEncoding);
			
			System.out.println(":My company name is \"GratsIt\" :"+fileEncoding);
			
		}
	
	}