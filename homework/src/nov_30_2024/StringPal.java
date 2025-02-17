package nov_30_2024;

public class StringPal {
	static void strPal() {
		String a="12321n";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println(a +"is palindrome");
			
		}else {
			System.out.println(a +"is npt a palindrome");
		}
	}
	public static void main(String[]args) {
		strPal();
	}

}
