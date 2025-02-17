package nov_12_2024;

public class Fibonacci {
	public static void finNum() {
		int a=0,b=1,c,count=10;
		for(int i=1;i<=count;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	public static void main(String[]args) {
		finNum();
		
	}

}
