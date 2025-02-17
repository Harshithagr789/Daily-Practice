package nov_06_2024;

public class Factorial {
	static void factNum() {
		int n=3;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
			
		}
		System.out.println(fact);
	}
	public static void main(String[]args) {
		factNum();
	}

}
