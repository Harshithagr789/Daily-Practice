package dec_20_24;

import java.util.Arrays;

public class SortingAlgo {
	public void bubbleSort(int a[]) {
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
public static void main(String[] args) {
	int a[]= {6,8,3,9,4,2};
	SortingAlgo s=new SortingAlgo();
	s.bubbleSort(a);
	System.out.println(Arrays.toString(a));
}
}
