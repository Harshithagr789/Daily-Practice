package dec_2_2024;

import java.util.Arrays;

public class ArrayPalindrome {
	static boolean paliArray(int a[]) {
		int start=0;
		int end=a.length-1;
		while(start<end) {
			if(a[start]!=a[end]) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		if(paliArray(a)) {
			System.out.println(Arrays.toString(a)+"is pal");
		}else {
			System.out.println(Arrays.toString(a)+"is not pal");
		}
		
	}

}
