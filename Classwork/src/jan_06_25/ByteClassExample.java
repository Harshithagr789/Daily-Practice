package jan_06_25;

import java.util.Collections;

public class ByteClassExample {
	public static void main(String[] args) {
		Byte b=Byte.valueOf("10");
		Byte b1=Byte.valueOf(b);
		Byte b2=Byte.valueOf("200",2);
		Byte b3=Byte.parseByte("30");
		Byte b4=Byte.parseByte("100",2 );
		System.out.println(b4.compareTo(b3));
		String b7= b3.toString();
		//Byte b8=Collections.max();
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		//System.out.println(b5);
		//System.out.println(b6);
		System.out.println(b7);
		//System.out.println(b8);
		
		
		
		
	}

}
