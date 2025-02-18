package Programs;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int flag = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				flag++;
				break;
			}
		}
		if (flag < 2) {
			System.out.println(n + " prime");
		} else {
			System.out.println(n + " not prime");

		}

	}

}
