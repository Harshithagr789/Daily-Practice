package feb_13_2025;

public class Exceptionnnnn {
	public static void main(String[] args) throws ArithmeticException {
		int a=10;
		int b=20;
		System.out.println(a+b);
		try {
			System.out.println(a);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
	}
	

}
