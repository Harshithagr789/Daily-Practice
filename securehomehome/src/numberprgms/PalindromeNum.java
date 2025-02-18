package numberprgms;

public class PalindromeNum {
	static void palNum() {
	int rev=0;
	int temp;
	int n=12321;
	temp=n;
	while(n>0) {
		rev=rev*10+n%10;
		n=n/10;
		
	}
	if(rev==temp) {
		System.out.println(temp +"is palindrome");
	}else {
		System.out.println(temp +"is not a palindrome");
	}
	}
	public static void main(String[]args) {
		palNum();
	}
}
