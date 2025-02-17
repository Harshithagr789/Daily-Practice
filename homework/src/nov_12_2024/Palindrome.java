package nov_12_2024;

public class Palindrome {
	static void palNum(int n) {
		
		int temp;
		int rev=0;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
			
		}if(temp==rev) {
			System.out.println(temp +"is palindrome");
		}else {
			System.out.println(temp +"is not palindrome");
		}
	}
		
	public static void main(String[]args) {
		palNum(12345);
	}

}
