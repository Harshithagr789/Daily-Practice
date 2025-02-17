package dec_03_2024;

public class SwapStr {
	public int swapStr(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		return a;
		//return b;
	}
	return b;
	public static void main(String[] args) {
		int a=10;
		int b=20;
		SwapStr s=new SwapStr();
		s.swapStr(a, b);
		System.out.println(s.swapStr(a, b));
	}

}
