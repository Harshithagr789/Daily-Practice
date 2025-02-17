package nov_11_2024;

public class fibonacci {
	public static void main(String[]args) {
		 for(int j=1;j<=15;j++) {
			 fibNum(j);

		 }
				}
	
	static void fibNum(int count) {
		int b=0,c=1,d;
		
		System.out.println(b);
		System.out.println(c);
		for(int i=2;i<=count;i++) {
			d=b+c;
			System.out.println(d);
			b=c;
			c=d;
		}
	
		
	}
		
	}


