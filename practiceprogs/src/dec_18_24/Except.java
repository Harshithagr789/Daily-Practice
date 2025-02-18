package dec_18_24;

import java.io.FileNotFoundException;

public class Except {
	public void method(int a,int b) {
		
			int c=a/b;
			throw new ArithmeticException();
			//System.out.println(c);
		
		
	}
public static void main(String[] args) {
	Except a=new Except();
	/*try{
		a.method(4, 0)p
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		throw new ArithmeticException();
	}*/
	a.method(4, 0);
	
}
}
