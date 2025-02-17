package nov_06_2024;

public class Primenumber {
	public static void main(String[]args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			
			}
		}
		if(count>2) {
				System.out.println(n + "not prime");
			}
			else {
				System.out.println(n +"prime");
			}
		}
		
	

}
