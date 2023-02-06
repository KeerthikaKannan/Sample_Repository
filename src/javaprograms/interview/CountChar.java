package javaprograms.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountChar {
public static void main(String a[]) {
	String str="Java";
	LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(map.containsKey(ch)) {
			map.replace(ch, map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	for(Map.Entry<Character,Integer> pair:map.entrySet()) {
		System.out.println(pair);
	}
}
}
