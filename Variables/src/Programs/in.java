package Programs;

public class in {

	public static void main(String[] args) {
		// TODint Auto-generated method stub
		int a = 2;
		int b = 5;
		int c = 7;
		int d = ++a + ++b + ++c;
		int e = d++ - ++c - --d + --a - --b + --c;
		int f = e++ + ++d + --a - --a;
		int g = a + b + c + d + e + f;
		int h = a * b - c + d;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		for(int i=1;i<=100;i++) {
			primeNum(i);
		}
		
	}
	
	public static void patternNum() {
		for(int i=0;i<=5;i++) {
			if(i%2==0) {
				
				continue;
			}
			else {
				System.out.println(i +"not even");
			}
		}
	}
	static int returnN() {
		int a=0;
		for(int i=0;i<=5;i++) {
			
			if(i%2==0) {
				
				System.out.println(i +"even");
				
			}
			else {
				System.out.println(i +"not even");
			}
		}
		return a;
		
	}
	static void primeNum(int n) {
 		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
		}
			if(count>2) {
				System.out.println(n +"not prime");
			}
			else {
				System.out.println(n +"prime");
			}
		
	}
	

}
