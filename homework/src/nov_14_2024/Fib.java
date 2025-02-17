package nov_14_2024;

public class Fib {
	static void fiNum() {
		int a = 0;
		int b = 1;
		int c;
		int count = 4;
		for (int i = 1; i <= count; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		fiNum();
	}

}
