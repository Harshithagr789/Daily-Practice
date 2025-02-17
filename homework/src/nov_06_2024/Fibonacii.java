package nov_06_2024;

public class Fibonacii {
	public void fibNum() {
		int a=0,b=1,c=0,count=4;
		for(int i=1;i<=count;i++) {
			c=a+b;
		
			a=b;
			b=c;
		}
		System.out.println(c);
	}
	public static void main(String[]args) {
		Fibonacii f=new Fibonacii();
		f.fibNum();
	}

}
