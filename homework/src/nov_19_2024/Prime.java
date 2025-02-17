package nov_19_2024;

public class Prime {
	static int primeNum(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>2) {
			return n;
		}
		else
		{
			return 0;
		}
		
	}
	public static void main(String[]args) {
		int s=primeNum(6);
		System.out.println(s);
	}

}
