package dec_04_24;

public class Factorial {
	public int FactNum(int n) {
		if(n==0) {
			return 1;
		}
			else {
				return(n*FactNum(n-1));
		}
		
	}
	public static void main(String[] args) {
		int fact=1;
		int n=5;

		Factorial f=new Factorial();
		fact=f.FactNum(n);
		System.out.println(fact);
		
	}

}
