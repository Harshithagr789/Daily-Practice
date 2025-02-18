package gcd;

public class CountNumberOfString {
	/*static void countNum() {
		String s="harshii";
		int count=0;
		for(int i=0;i<=s.length();i++) {
			count++;
			
		}
		System.out.println(s.length());
	}
	public static void main(String[]args) {
		countNum();
	}*/
	public  int countNum(String s) {
		int count=s.length();
		for(int i=0;i<=s.length();i++) {
			count++;
		}
		return s.length();
	}
	public static void main(String[]args) {
		CountNumberOfString s=new CountNumberOfString();
		int a=s.countNum("harshii");
		System.out.println(a);
	}

}
