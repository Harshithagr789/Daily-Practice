package dec_1_24;

public class RevWord {
	public static void revWord() {
		String a="harshitha is gud girl";
		String rev=" ";
		String[] word=a.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			String revword=new StringBuilder(word[i]).reverse().toString();
			//rev+=revword;
			rev+=word[i];
			if(i!=0) {
				rev+=" ";
			}
			
		}
		System.out.println(rev);
		
	}
	public static void main(String[]args) {
		revWord();
	}

}
