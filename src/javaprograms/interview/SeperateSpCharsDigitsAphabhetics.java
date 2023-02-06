package javaprograms.interview;

import java.util.ArrayList;

public class SeperateSpCharsDigitsAphabhetics {
	public static void main(String args[]) {
		ArrayList chars = new ArrayList<>();
		ArrayList digits = new ArrayList<>();
		ArrayList sp_chars = new ArrayList<>();
		String str = "Jav%a4567&$%";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				chars.add(ch);
			} else if (Character.isDigit(ch)) {
				digits.add(ch);
			} else {
				sp_chars.add(ch);
			}
		}
		System.out.println("Alphabetics Count: " + chars.size());
		System.out.println("Digit Count: " + digits.size());
		System.out.println("Special Character Count: " + sp_chars.size());
		
		/*
		 * Object[] ch=chars.toArray(); System.out.println(ch.length);  //We can convert to array and print count if they mentioned in question
		 */
		
	}
}
