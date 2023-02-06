package javaprograms.interview;

import java.util.HashMap;

public class RemoveDupliChars {
	public static void main(String args[]) {
		String str = "madam";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.remove(ch);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
