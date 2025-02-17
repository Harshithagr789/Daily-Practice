package jan_02_2025;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exp1 extends Excepover{
	public void method1() {
		int a=4/10;
		System.out.println(a);
	}
	public void method2()throws IOException {
		System.out.println("its a ioexception");
	}
	public static void method3()throws ClassNotFoundException {
		System.out.println("throws exception");
	}
}
