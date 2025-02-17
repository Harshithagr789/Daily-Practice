package jan_06_25;

public class DoubleMethodExample {
	public static void main(String[] args) {
		Double d1=Double.valueOf("123");
		Double d2=Double.valueOf(d1);
		Double d3=Double.parseDouble("456");
		Double d4=Double.sum(d1, d2);
		//Double d5=Double.toString(1.34);
		Double d5=Double.max(d1, d3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
	}

}
