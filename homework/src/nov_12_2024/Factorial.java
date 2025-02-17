package nov_12_2024;

public class Factorial {
	static void  facNum() {
		int n=8;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		
			
		}
		System.out.println(fact);
	}
	public static void main(String[]args) {
		facNum();
	}

}
