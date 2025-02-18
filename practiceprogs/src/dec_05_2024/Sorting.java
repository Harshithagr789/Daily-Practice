package dec_05_2024;

import java.util.Arrays;

public class Sorting implements Bubble {
	public void bubbleSort(int a[]) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {3,6,8,9,2,4};
		Sorting s=new Sorting();
		s.bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
