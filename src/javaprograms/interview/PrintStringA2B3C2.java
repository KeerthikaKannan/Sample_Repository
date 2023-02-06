package javaprograms.interview;

public class PrintStringA2B3C2 {
	public static void main(String args[]) {
		String str = "a2b3c2";
		String arr[] = new String[3];
		int temp = 0;

		for (int i = 0; i < str.length(); i = i + 2) {
			arr[temp] = str.substring(i, i + 2);
			temp++;
		}
		String output = "";
		for (String val : arr) {
			 System.out.println(val);
			char last_Char = val.charAt(1);
			int count = Character.getNumericValue(last_Char);
			for (int i = 0; i < count; i++) {
				output = output + val.charAt(0);
			} 
		}
		System.out.print(output);
	}
}
