package javaprograms.interview;
public class SwapString {
	public void withTemp() {
		String str1 = "Never";
		String str2 = "Change";
		String temp = null;
		System.out.println("String: " + str1 + " " + str2);
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("Swap String with 3rd variable: " + str1 + " " + str2);
	}
	public void withOutTemp() {
		String str1 = "Never";
		String str2 = "Change";
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length()); // Never
		str1 = str1.substring(str2.length()); // Change
		System.out.print("Swap String without 3rd variable: " + str1 + " " + str2);
	}
	public static void main(String args[]) {
		SwapString swap = new SwapString();
		swap.withTemp();
		swap.withOutTemp();
	}
}
