package nov_06_2024;

public class Swap {
	public void sawpNum() {
		int a=10;
		int b=30;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[]args) {
		Swap s=new Swap();
		s.sawpNum();
	}

}
