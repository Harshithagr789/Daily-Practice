package dec_1_24;

public class StringPal {
	public static void palRev() {
		String s = "mom";
		String rev = "";
		for (int i = s.length() - 1; i >=0; i--) {
			rev += s.charAt(i);

		}
		if (s.equals(rev)) {
			System.out.println(s + "is pal");
		} else {
			System.out.println(s + "is not pal");
		}
	}

	public static void main(String[] args) {
		palRev();
	}

}
