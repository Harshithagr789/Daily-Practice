
public class SortQuick implements Quick {
	public  int partion(int a[], int low, int high) {
		int pivot = a[low];
		int i = low + 1;
		int j = high;
		while (i <= j) {
			while (i <= j && a[i] <= pivot) {
				i++;
			}
			while (i <= j && a[j] > pivot) {
				j--;
			}
		}
		if (i < j) {
			swap(a, i, j);
		}
		swap(a, low, j);
		return j;

	}

	public  void bubble(int a[], int low, int high) {
		if (low < high) {
			int pivotIndex = partion(a, low, high);
			bubble(a, low, pivotIndex - 1);
			bubble(a, pivotIndex + 1, high);
		}
	}

	public  void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		 SortQuick s=new  SortQuick();
		int a[] = { 3, 6, 8, 2, 4, 7, 3 };
		System.out.println("original method");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		s.bubble(a, 0, a.length - 1);
		System.out.println("sorted array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
	}

}
