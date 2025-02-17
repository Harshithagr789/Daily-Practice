package nov_15_2024;

public class Reverse {
	public static void revNum() {
		int n=26345;
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
			
		}
		System.out.println(rev);
	}
	public static void main(String[]args) {
		revNum();
		
	}

}
