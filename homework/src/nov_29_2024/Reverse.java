package nov_29_2024;

public class Reverse {
	public static void revStr() {
		String a="harshitha";
		String rev=" ";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
			
		}
		System.out.println(rev);
	}
public static void main(String[]args) {
	revStr();
}
}
