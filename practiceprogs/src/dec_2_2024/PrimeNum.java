package dec_2_2024;

public class PrimeNum {
static void priNum() {
	int n=10;
	int count=0;
	for(int i=3;i<=n;i++) {
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
