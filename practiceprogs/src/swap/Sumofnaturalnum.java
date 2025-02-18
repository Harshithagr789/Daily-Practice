package swap;

public class Sumofnaturalnum {
	public static void sumNatural() {
		int sum = 0;
		int n = 100;
		while (n > 0) {
		

			sum = sum + n;
			n = n - 1;
			
		}
		System.out.println("the sum is"+sum);
	}
	//or
	public void sumOf() {
		int a=100;
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum+=i;
			
		}
		System.out.println("the sum is"+sum);
		
	}
	

	public static void main(String[] args) {
		sumNatural();
		Sumofnaturalnum s=new Sumofnaturalnum();
		
		s.sumOf();

	}
	
}
