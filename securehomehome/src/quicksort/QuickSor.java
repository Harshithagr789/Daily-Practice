package quicksort;

import java.util.Arrays;

public class QuickSor {
	public static int partition(int a[],int low,int high) {
		int pivot=a[low];
		int i=low+1;
		int j=high;
		while(i<=j) {
			while(i<=j&&a[i]<=pivot) {
				i++;
			}
			while(i<=j&&a[j]>pivot) {
				j--;
			}
			if(i<j) {
				swap(a,i,j);
			}
		}
		swap(a,low,j);
		return j;
	}
	public static void quickSorting(int a[],int low,int high) {
		if(low<high) {
			int pivotIndex=partition(a,low,high);
			quickSorting(a,low,pivotIndex-1);
			quickSorting(a,pivotIndex+1,high);
			
		}
	}
	public static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	public static void main(String[] args) {
		int a[]= {2,7,5,8,9,3,68,5};
		System.out.println("original array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		quickSorting(a,0,a.length-1);
		System.out.println("sorted array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
