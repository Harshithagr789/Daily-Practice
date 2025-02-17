package nov_29_2024;

public class StringPal {
	public static void palStr() {
		String b="mom";
		String rev="";
		for(int i=b.length()-1;i>=0;i--) {
			rev+=b.charAt(i);
			
		}
		if(b.equals(rev)) {
			System.out.println(b +"is palindrome");
		}else {
			System.out.println(b +"is not a palindrome");
		}
	}
public static void main(String[]args) {
	palStr();
	
}
}

