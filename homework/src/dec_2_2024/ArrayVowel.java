package dec_2_2024;

public class ArrayVowel {
	static boolean vowelNum(char ch) {
		String a="aeiouAEIOU";
		return a.indexOf(ch)!=-1;
		
		
		
	}
	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e','f'};
		for(int i=0;i<ch.length;i++) {
			if(vowelNum(ch[i])) {
				System.out.println(ch[i]+" ");
				
			}
		}
	}

}
