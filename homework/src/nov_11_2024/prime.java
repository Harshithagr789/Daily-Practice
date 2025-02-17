package nov_11_2024;

public class prime {
	public static void main(String[]args) {
		int n=11;
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count>2) {
				System.out.println(n +"is not prime");
			}else {
				System.out.println(n +"is prime");
			}
		
	}

}
