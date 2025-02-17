package nov_15_2024;

public class Prime {
	public static void primeNum() {
		int n=4;
		int count=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
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
	public static void main(String[]args) {
		primeNum();
	}

}
