package nov_12_2024;

public class Reverse {
	static void revNum() {
		int n=7890;
		int temp;
		int rev=0;
		temp=n;
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
