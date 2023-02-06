package javaprograms.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CountWordsUsingMap {
	public static void main(String args[]) {
		CountWordsUsingMap map=new CountWordsUsingMap();
		map.wordCount();
		map.iterateOverHashMap();
	}
	public void wordCount() {
		String str = "hai hello hai to sunday hello";
		String s[] = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			if (map.containsKey(word)) {
				map.replace(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		/*
		 * for(String key:map.keySet()) { System.out.println(key+ " count: "+
		 * map.get(key)); }
		 */
		/* System.out.println(map); */
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			// System.out.print(pair+" ");
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}
	public void iterateOverHashMap() {
		Map<Character,Integer> map=new HashMap<>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		Iterator it=map.entrySet().iterator();   //Using Iterator
		while(it.hasNext()) { 
			System.out.print(it.next()+" ");
		}
		System.out.println("\n");
		for(Map.Entry set:map.entrySet()) {
			System.out.print(set+" ");
		}
        
		
	}
}
