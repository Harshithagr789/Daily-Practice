package dec_20_24;

public class Fib {
	static void fibNum() {
		int n=0;
		int m=1;
		int a=0;
		for(int i=2;i<=10;i++) {
			a=n+m;
			System.out.println(a);
			n=m;
			m=a;
		}
		
	}
public static void main(String[]args) {
	fibNum();
}
}

