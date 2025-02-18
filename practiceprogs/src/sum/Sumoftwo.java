package sum;

public class Sumoftwo {
	static int sumOf(int a,int b) {
		
	
		return a+b;
	}
	static int squareOf(int a) {
		int square=a*a;
		return square;
	}
	static int areaOf(int r) {
		int area=3.14*r*r;
		return area;
	}
	public static void main(String[]args) {
		int d=sumOf(2,5);
		System.out.println(d);
		int q=squareOf(2);
		System.out.println(q);
		int z=areaOf(2);
		System.out.println(z);
	}

}
