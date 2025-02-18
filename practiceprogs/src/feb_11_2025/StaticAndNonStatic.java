package feb_11_2025;

public class StaticAndNonStatic {
	public StaticAndNonStatic() {

		nonStaticConstructor();

		staticConstructor();
	}

	public void nonStaticConstructor() {
		System.out.println("constructor having non static keyword");
	}

	public static void staticConstructor() {
		System.out.println("constructor having static keyword");

	}

	public static void main(String[] args) {
		StaticAndNonStatic s = new StaticAndNonStatic();

	}

}
