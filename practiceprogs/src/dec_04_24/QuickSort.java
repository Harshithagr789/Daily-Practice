package dec_04_24;

public class QuickSort  {
	
		
	    // Method to partit array
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[low]; // First element as pivot
	        int i = low + 1; // Start from the next element
	        int j = high;

	        while (i <= j) {
	            // Find elements on the wrong side of the pivot
	            while (i <= j && arr[i] <= pivot) {
	                i++;
	            }
	            while (i <= j && arr[j] > pivot) {
	                j--;
	            }

	            // Swap if necessary
	            if (i < j) {
	                swap(arr, i, j);
	            }
	        }

	        // Place the pivot in its correct position
	        swap(arr, low, j);

	        return j; // Return the index of the pivot
	    }

	    // Method to perform quicksort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);

	            // Recursively sort the subarrays
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    // Utility method to swap elements
	    public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    // Main method
	    public static void main(String[] args) {
	        int[] arr = { 10, 7, 8, 9, 5,1 };
	        System.out.println("Original Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        quickSort(arr, 0, arr.length - 1);

	        System.out.println("\nSorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


