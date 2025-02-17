package dec_3_2024;

import java.util.Arrays;

public class Arrray implements Sort {
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
		int a[]= {4,8,3,8,9,4,6,96,4};
		Arrray b=new Arrray();
		b.bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
