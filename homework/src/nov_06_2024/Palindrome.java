package nov_06_2024;

public class Palindrome {
	static void palNum() {
		int n=80373;
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println(temp +"is palindrome");
		}else {
			System.out.println(temp +"is not a plaindrome");
		}
	}
	public static void main(String[]args) {
		palNum();
	}

}
