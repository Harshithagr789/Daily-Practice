package nov_28_24array;

public class ArrayPal {
	public static void main(String[]args) {
		String s[]={"mom"};
		String rev=" ";
		String word=s[0];
		
		
		for(int i=s[0].length()-1;i<=0;i--) {
			rev+=word.charAt(i);
		}
		
			if(s.equals(rev)) {
				System.out.println(word+"is palindrome");
			}else {
				System.out.println(word+"is not palindrome");
			}
		}
}