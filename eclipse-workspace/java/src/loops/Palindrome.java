package loops;

import java.util.Scanner;

public class Palindrome {
	String word;
	int wordlength;
	Palindrome (String word){
		int wordlength = word.length();
		this.word = word;
		this.wordlength=wordlength;
	}
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the word to check the Palindrome -");
		String word = ref.nextLine();
		Palindrome obj = new Palindrome(word);
		obj.checkPalindrome();
		ref.close();
	}
	String checkPalindrome() {
		int count= 0;
		for (int i=0;i<=wordlength-1;i++) {
			if (word.charAt(i)==word.charAt(wordlength-1-i)) {
				count+=1;
			}
		}if (count==wordlength) {
			System.out.println("The word you entered is a Palindrome");
		}else {
			System.out.println("The word you entered is not a palindrome");
		}
		return word;
	}
}
