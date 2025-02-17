package jan_02_2025;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Excepover {
	public void method1() {
		System.out.println("Arthimatic exception");
	}
	public void method2()throws Exception {
		System.out.println("IO exception");
	}
	public static void method3()throws ClassNotFoundException {
		System.out.println("class not found");
	}
	public void method4() {
		System.out.println("");
	}

}
