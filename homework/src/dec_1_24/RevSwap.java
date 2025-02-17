:?package dec_1_24;

public class RevSwap {
	public void swapRev() {
		String a="12345";
		String b="67890";
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[]args) {
		RevSwap e=new RevSwap();
		e.swapRev();
	}

}
