package jan_02_2025;

import java.io.IOException;

public class ExceptionOverridings {
	public static void main(String[] args) {
		Excepover e=new Exp1();
		e.method1();
		try {
			e.method2();
		}
		catch(Exception i) {
			System.out.println(i);
		}
		try{
			e.method3();
		}
		catch(ClassNotFoundException c) {
			System.out.println(c);
		}
	}

}
