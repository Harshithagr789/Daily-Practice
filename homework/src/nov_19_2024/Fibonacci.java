package nov_19_2024;

public class Fibonacci {
	static int fibNum(int a,int b) {
		for (int i=2;i<=5;i++) {
			int c=a+b;
			
		}
		return c;
		a=b;
		b=c;
		c=a;
		
		
	}
	public static void main(String[]args) {
		int v=fibNum(0,1);
		
		System.out.println(v);
		//System.out.println(c);
	}

}
