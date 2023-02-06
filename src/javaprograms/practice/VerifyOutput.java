package javaprograms.practice;

public class VerifyOutput {
	public static void main(String[] args) {
		/*
		 * String str="Welcome to the company"; StringBuffer sb=new StringBuffer(str);
		 * for(int i=0;i<sb.length();i++) { char ch=sb.charAt(i);
		 * if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) { String s=ch+" ";
		 * sb.replace(i, i+1, s); } } System.out.println(sb.toString());
		 */

		String ip = "babcadaefhef";
		int z = 0;
		int t;
		char arr[] = ip.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			t = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {  //b a a e f
					t++; //t=3
				}
			}
			if (t > 1) {
				System.out.print(arr[i]); //b a a e f
				z++; //z=1, z=2, z=3, z=e, z=f
			}
		}
		System.out.println("\n"+z); 
	}
}
