package nov_13_2024;

public class Prime {
	public static void main(String[]args) {
		int n=5;
		int count=0;
		for(int i=3;i<=5;i++) {
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
		}
	

}
