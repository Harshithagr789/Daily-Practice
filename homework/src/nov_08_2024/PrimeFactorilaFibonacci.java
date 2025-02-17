package nov_08_2024;

public class PrimeFactorilaFibonacci {
	
		public static void primeNum() {
			
		
		int n=5;
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
			if(count>2) {
				System.out.println(n +"not prime");
			}
			else {
				System.out.println(n +"prime");
			}
		}
			
			//factorial
			static void factoNum() {
			
			int a=5;
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact=fact*i;
				System.out.println(fact);
			}
			}
			//fibonacci
			static void fibNum() {
			int b=0,c=1,d,flag=5;
			for(int i=0;i<=flag;i++) {
				d=b+c;
				System.out.println(d);
				b=c;
				c=d;
			}
			
			
		
	}
			public static void palindromeNum() {
			int n=12321;
			int rev=0;
			int org_num;
			org_num=n;
			while(n>0){
			rev=(rev*10)+(n%10);
			n=n/10;
			}
			if(org_num==rev) {
				System.out.println(org_num+"is a palindrome");
			}
			else {
				System.out.println(org_num+"is not a palindrome");
			}
			}
			
			public static void reverseNum() {
				int n=123456;
				int rev=0;
				int org_num;
				org_num=n;
				while(n>0){
				rev=(rev*10)+(n%10);
				n=n/10;
				}
				System.out.println(rev);
			}
			
		
public static void main(String[]args) {
	palindromeNum();
	//reverseNum();
}
	
	

}
