package nov_15_2024;

public class Fibonacii {
	static void fibNum() {
		int a=0;
		int b=1;
		int c;
		int count=5;
		for(int i=1;i<=count;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[]args) {
		fibNum();
	}

}
