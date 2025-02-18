package dec_20_24;

public class GcdNum {
	static void gcdNumber() {
		int a=4;
		int b=8;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
				
			}
		
		}
		System.out.println(gcd);
	}
	public static void main(String[] args) {
		gcdNumber();
	}

}
