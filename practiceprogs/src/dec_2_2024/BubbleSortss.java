package dec_2_2024;

import java.util.Arrays;

public class BubbleSortss {
	static void bubblesoRt(int a[]) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[]args) {
		int a[]= {1,4,7,9,3,5,7,2,7,07};
		bubblesoRt(a);
		System.out.println(Arrays.toString(a));
	}

}
