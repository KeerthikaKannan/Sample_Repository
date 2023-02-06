package javaprograms.interview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AscendingOrderUsingArrayList {
	public void usingSortMethod() {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(60);
		list.add(10);
		list.add(80);
		Collections.sort(list);
		System.out.println("Sorted ArrayList Using Collections.sort() method: ");
		for (Object value : list) {
			System.out.print(value+" ");
		}	}
	public void withoutUsingSortMethod() {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(60);
		list.add(10);
		list.add(80);
		System.out.println("\n"+"Sorted ArrayList Without Using sort() method: ");
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
			System.out.print(list.get(i)+" ");
			}}
	public static void main(String args[]) {
		AscendingOrderUsingArrayList ascd = new AscendingOrderUsingArrayList();
		ascd.usingSortMethod();
		ascd.withoutUsingSortMethod();
	}
}
