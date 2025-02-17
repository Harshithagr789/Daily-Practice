package nov_07_2024;

public class PrimeFactorial {
	public static void main(String[]args) {
		int n=9;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
			if(count>2) {
				System.out.println(n +"is not prime");
			}
			else {
				System.out.println(n +"is prime");
			}
		
		
		//factorial
		
		int a=10;
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			
		}
		System.out.println("the number is"+" "+fact);
		
		
		//fibonacci
		int b=0,c=1,d,flag=10;
		for(int i=2;i<flag;i++) {
			d=b+c;
			System.out.print(d+" ");
			b=c;
			c=d;
		}
		
	}

}
