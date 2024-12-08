public class DefaultEncodingCheck{

	public static void main(String[] args){
		
		String defaultEncoding  = System.getProperty("file.encoding");
		System.out.println(":defaultEncoding:"+defaultEncoding);
		
		String name="My na\tme \"Rak\nesh\"";
		System.out.println(":name:"+name);
	}

}