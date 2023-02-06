package javaprograms.practice;
public class Demo1 {
	public static void main(String args[]) {
		Demo1 demo = new Demo1();
		demo.prime();
		demo.fibonacci();
	}
	public void prime() {
		int num = 24;
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		if (prime == true) {
			System.out.println(num+" Prime Number");
		} else {
			System.out.println(num+" Not a prime number");
		}
	}
	public void fibonacci() {
		int a=0,b=1,c=0;
		System.out.print("Fibonacci Series: "+a+" "+b+" ");
		for(int i=1;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
