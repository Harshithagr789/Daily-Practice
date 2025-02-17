package jan_06_25;

public class ShortClassExample {
	public static void main(String[] args) {
		Short s1 = Short.valueOf("3");
		Short s2 = Short.valueOf(s1);
		//Short s3 = (short) Short.hashCode(s1);
		Short.
		String s4 = s2.toString();
		Short s5 = Short.parseShort("4003", 5);
		Short s6 = Short.parseShort("130");
		//Short s7=Short.toUnsignedInt(10);
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		//System.out.println(s7);
	}
}


