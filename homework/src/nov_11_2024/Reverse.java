package nov_11_2024;

public class Reverse {
	public int revNum(int n) {
		int rev=0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
			
		}
		
		return rev;
	}
	
	public static void main(String[]args) {
		Reverse r=new Reverse();
		
		
		System.out.println(r.revNum(12345));
		int z=r.revNum(12345);
		System.out.println(z);
	}

}
