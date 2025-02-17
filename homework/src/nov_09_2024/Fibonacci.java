package nov_09_2024;

public class Fibonacci {
	public void fibNum() {
		int a=0,b=1,c,count=5;
		for(int i=0;i<=count;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[]args) {
		Fibonacci f=new Fibonacci();
		f.fibNum();
	}

}
