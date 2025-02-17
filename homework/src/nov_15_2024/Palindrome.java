package nov_15_2024;

public class Palindrome {
	static void palNum() {
		int n=34567;
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(temp==n) {
			System.out.println(temp+"is palindrome");
		}else {
			System.out.println(temp+"is not a palindrome");
		}
	}
	public static void main(String[]args) {
		palNum();
	}

}
