package nov_29_2024;

public class WordRev {
	static void revWord() {
		String q="harshi is a good girl";
		String rev="";
		String[] word=q.split(" ");
		for(int i=word.length-1;i>=0;i++) {
			String reverseword=new StringBuffer(word[i]).reverse().toString();
			rev+=reverseword;
			rev+=word[i];
			if(i!=0) {
				rev+="";
			}
			System.out.println(rev);
		}
		public static void main(String[]args) {
			revWord();
		}
	}

}
