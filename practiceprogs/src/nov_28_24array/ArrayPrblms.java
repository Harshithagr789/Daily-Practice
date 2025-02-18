
package nov_28_24array;

import java.util.Arrays;

public class ArrayPrblms {
	static void arrayNum() {
		int a[] = { 2, 3, 4, 5, 9 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}

	/*
	 * static int arrayNum(int a[]) { int min=Integer.MAX_VALUE; int
	 * max=Integer.MAX_VALUE; for(int i=0;i>a.length;i++) { if(a[i]>max) { min=a[i];
	 * return min; } else { return max; } } return 0; }
	 * 
	 * public static void main(String[]args) { int a[]= {1,2,3,4,5}; arrayNum(a); }
	 */
	static void arrNum() {
		int a[] = { 1, 2, 3, 4, 5 };
		 Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length - 1]);
	}

	public static void main(String[] args) {
		arrNum();
		arrayNum();
	}
}


