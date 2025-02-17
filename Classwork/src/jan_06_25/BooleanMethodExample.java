package jan_06_25;

public class BooleanMethodExample {
	public static void main(String[] args) {
		Boolean b1=Boolean.valueOf(true);
		Boolean b2=Boolean.valueOf(false);
		Boolean b3=Boolean.logicalAnd(b1,b2);
		Boolean b4=Boolean.logicalOr(b2, b2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
	}

}
