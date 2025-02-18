package quicksort;

public class PalinNum {
	static void palindromeNum() {
		int n=12311;
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println(temp+"is palindrome");
		}else {
			System.out.println(temp+"is not palindrome");
		}
	}
	public static void main(String[] args) {
		palindromeNum();
	}

}
