package nov_09_2024;

public class Reverse {
	public static void main(String[]args) {
		int n=12345;
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}

}
