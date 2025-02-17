package nov_06_2024;

public class Reverse {
	public static void revNum() {
		int n=2832;
		int rev=0;
		int temp;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static void main(String[]args) {
		revNum();
	}

}
