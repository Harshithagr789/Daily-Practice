package dec_04_24;

public class QuickSort1 {
	public static int partion(int a[],int low,int high) {
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
	public static void quickSort(int a[],int low,int high) {
		if(low<high) {
			int pivotIndex=partion(a,low,high);
			quickSort(a,low,pivotIndex-1);
			quickSort(a,pivotIndex+1,high);
		}
	}
	public static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
public static void main(String[] args) {
	int a[]= {4,8,2,6,9,2,67,8,9};
	System.out.println("original array");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	quickSort(a,0,a.length-1);
	System.out.println("sorted array");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}

