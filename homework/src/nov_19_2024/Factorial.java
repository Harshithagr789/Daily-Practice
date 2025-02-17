package nov_19_2024;

public class Factorial {

	static int factNum(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main(String[]args) {
		int n=factNum(5);
		System.out.println(n);
	}
}
