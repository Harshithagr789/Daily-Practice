package nov_28_24array;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[]args) {
		char a[]= {'h','a','r','s','i','t','h','a'};
		int count=0;
		for(int i=0;i<a.length;i++) {
			
				 char c = Character.toLowerCase(a[i]); // Convert the character to lowercase
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                	count++;
	                }
			
				
			}
		System.out.println("total vowels:"+count);
		
		}
		/*public class Main {
		    public static void main(String[] args) {
		        String[] arr = {"apple", "banana", "cherry"};
		        int vowelCount = 0;

		        for (int i = 0; i < arr.length; i++) { // Iterate through the array
		            String word = arr[i].toLowerCase(); // Convert the current string to lowercase
		            for (int j = 0; j < word.length(); j++) { // Iterate through each character in the string
		                char c = word.charAt(j); // Get the character at position j
		                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                    vowelCount++;
		                }
		            }
		        }

		        System.out.println("Total vowels: " + vowelCount);
		    }*/
		}