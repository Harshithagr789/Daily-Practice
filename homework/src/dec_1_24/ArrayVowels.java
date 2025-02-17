package dec_1_24;

public class ArrayVowels {
	public static boolean vowelsArray(char ch) {
		String vowel="aeiouAEIOU";
		return vowel.indexOf(ch)!=-1;
		
		
	}
	public static void main(String[]args) {
		char c[]= {'h','e','l','l','o','a'};
	for(int i=0;i<c.length;i++) {
		if(vowelsArray(c[i])) {
			System.out.println(c[i]+" ");
			
		}
	}
	}

}



/*public class CheckVowels {
    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};

        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nVowels in the array:");
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}

*/