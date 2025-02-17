/*package dec_13_24;

import java.io.IOException;


public class UncheckedExceptio123 {
	private static void arthiMatic()throws ArithmeticException {
		try {
			int a=10,b=5,c=5,result;
			result=a/(b-c);
			System.out.println(result);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	private static void arrayIndex() {
		try {
			int a[]=new int[5];
			
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
	}
	private static void numberFormat() {
		try {
		String s="harshi";
		int n=Integer.parseInt(s);
		System.out.println(n);
		}
	
	catch(NumberFormatException e2) {
		System.out.println(e2);
	}
	}
	public static void nullPoint() {
		try{
			String x=null;
		
		System.out.println(x.length());
	}
		catch(NullPointerException e3) {
			System.out.println(e3);
		}
	}
	
	public static void main(String[] args)  {
		arthiMatic();
		arrayIndex();
		numberFormat();
		nullPoint();
	}

}
*/



package dec_13_24;

import java.io.IOException;


public class UncheckedExceptio123 {
	private static void arthiMatic()throws ArithmeticException {
		
			int a=10,b=5,c=5,result;
			result=a/(b-c);
			System.out.println(result);
			
		
			//System.out.println(e);
		
	}
	private static void arrayIndex() throws ArrayIndexOutOfBoundsException {
		int a[]=new int[5];
			
			System.out.println(a[10]);
		
	}
	private static void numberFormat() throws NumberFormatException{
		
		String s="harshi";
		int n=Integer.parseInt(s);
		System.out.println(n);
		
	
	
		//System.out.println(e2);
	
	}
	public static void nullPoint()throws NullPointerException {
		
			String x=null;
		
		System.out.println(x.length());
	
		
			//System.out.println(e3);
		
	}
	
	public static void main(String[] args)  {
		arthiMatic();
		arrayIndex();
		numberFormat();
		nullPoint();
	}

}
