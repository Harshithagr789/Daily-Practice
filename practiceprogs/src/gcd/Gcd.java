package gcd;

public class Gcd {
	
		public  static void gcbNum() {
		int a=12;
		int b=8;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
				
				
			}
		}
		System.out.println(gcd);
		}
		public static void mulNum() {
			int n=2;
		int b;
		for(int i=1;i<=10;i++) {
		b=n*i;
			
		System.out.println("2*"+i+"="+b);
		}
		
			
		}
		public static void main(String[]args) {
			//gcbNum();
			mulNum();
			
			
		
	}

}
