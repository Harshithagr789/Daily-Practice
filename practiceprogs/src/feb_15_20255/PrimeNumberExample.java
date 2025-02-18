package feb_15_20255;

public class PrimeNumberExample {
	public static void main(String[] args) {
		int n=111;
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("its not a prime number"+n);
		}else {
			System.out.println("its a prime number"+n);
		}
	}

}
