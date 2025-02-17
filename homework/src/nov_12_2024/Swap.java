package nov_12_2024;

public class Swap {
	public void swapNum() {
		int x=10;
		int y=20;
		 int temp=0;
		 temp=x;
		 x=y;
		 y=temp;
		 System.out.println("x is ="+ x);
		 System.out.println(" y is ="+y);
	}
	public static void main(String[]args) {
		Swap s=new Swap();
		s.swapNum();
	}

}
