package nov_09_2024;

public class Factorial {
	public void factorialNum() {
	int n=5;
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
		System.out.println(fact);
		
		
	}
	}
	public static void main(String[]args) {
		Factorial f=new Factorial();
		f.factorialNum();
	}

}
