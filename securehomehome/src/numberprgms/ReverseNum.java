package numberprgms;

public class ReverseNum {
	public static int revNum(int n) {

		int rev = 0;
		
		int temp = n;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;

		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(revNum(12345));
	}

}
