package numberprgms;

public class Gcd {
	public static void gcdNum() {
		int a=10;
		int b=5;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
				
			}
			
		}
		System.out.println(gcd);
	}
	public static void main(String[]arg) {
		gcdNum();
	}

}
