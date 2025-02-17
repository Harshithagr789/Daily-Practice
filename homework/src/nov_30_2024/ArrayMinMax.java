package nov_30_2024;

import java.util.Arrays;

public class ArrayMinMax {
/*static void arrminMax() {
	int[] a= {1,2,3,4,5};
	//int count=a.length;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;

	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println(min);
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
}
public static void main(String[]args) {
	arrminMax();
}*/
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6};
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}
}

//or

