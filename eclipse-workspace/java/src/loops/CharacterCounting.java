package loops;

import java.util.Scanner;

public class CharacterCounting {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.err.println("enter the string ");
		String name = ref.nextLine();
		ref.close();
			for (int i=0;i<name.length();i++) {
				int count=1;
				if(i==0) {
					for(int m=i+1;m<name.length();m++) {
						if(name.charAt(i)==name.charAt(m)) {
							count+=1;
						}
					}
					System.out.print(count+""+name.charAt(i));
				}
				else {
					int breaking_num=0;
					for(int j=i-1;j>=0;j--) {
						if(name.charAt(i)==name.charAt(j)) {
							breaking_num+=1;
						}	
					}
					if(breaking_num>0) {
						continue;
					}
				
					for (int k=i+1;k<name.length();k++) {
						if(name.charAt(i)==name.charAt(k)) {
								count+=1;
						}
					}
					
				System.out.print(count+""+name.charAt(i));
			}
				
			}
	

	}

}
