package numberprgms;

public class PrimeRecursion {
	public static void main(String[] args) {
		int n = 15;
		boolean isPrimeNum = true;
		if (n <= 1) {
			isPrimeNum = false;

		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrimeNum = false;
					break;
				}
			}
		}
		if (isPrimeNum) {
			System.out.println(n + "is prime");
		} else {
			System.out.println(n + "is not prime");
		}

	}

}

/*package dec_04_24;

public class PrimeNum {
	public static void main(String[] args) {
		int n=21;
		boolean isPrimeNum=true;
		if(n<=1) {
			isPrimeNum=false;
		}else {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrimeNum=false;
					break;
				}
			}
		}
		if(isPrimeNum) {
			System.out.println(n+"is prime");
		}else {
			System.out.println(n+"is not prime");
		}
	}
	
}*/
		
