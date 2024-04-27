package java2;

public class Practice {
	public static void main(String[] args) {
		
		String s ="hi Hight highest HIhihihi";
		String s1 =s.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='h') {
				for(int j=i+1;j<=(i+1);j++) {
					if(s1.charAt(j)=='i') {
						count+=1;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
	
}