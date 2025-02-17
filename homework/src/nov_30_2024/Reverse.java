package nov_30_2024;

public class Reverse {
	static void revNum() {
	String s="harshi";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
		
		
	}
	System.out.println(rev);
	}
	static void countNum() {
		String a="harshi";
		int n=a.length();
		for(int i=0;i<=a.length();i++) {
			
		}
		System.out.println(a.length());
	}
	public static void main(String[]args) {
		revNum();
		countNum();
	}
}
