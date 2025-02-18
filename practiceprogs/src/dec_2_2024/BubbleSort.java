package dec_2_2024;

public class BubbleSort {
	static void bubbleSort(int a[]) {
		//int a[]= {3,5,7,1,3,6,98,1};
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
	}
	public static void main(String[]args) {
		int a[]= {1,5,8,3,8,5,9,3,4,7};
		bubbleSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
