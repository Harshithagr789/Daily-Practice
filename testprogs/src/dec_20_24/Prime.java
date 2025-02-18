package dec_20_24;

public class Prime {
	public static void priNum() {
		int n=9;
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println(n +"is not prime");
		}else {
			System.out.println(n +"is prime");
		}
	}
public static void main(String[] args) {
	priNum();
}
}
