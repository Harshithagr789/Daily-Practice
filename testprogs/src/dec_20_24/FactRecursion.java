package dec_20_24;

public class FactRecursion {
	public static int factRec(int n) {
		if(n==0) {
			return 1;
		}else {
			return (n*factRec(n-1));
		}
	}

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		fact=factRec(n);
		System.out.println(fact);
		
	}

}
