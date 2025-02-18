package Programs;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a %= b);
		if (a > b && b < a) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}
		if (a < b && b != a || b > a) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}
		System.out.println(a < b + sum);
		System.out.println(a != b & a < b | b < a);
System.out.println();
	}

}
