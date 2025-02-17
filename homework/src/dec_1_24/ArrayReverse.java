package dec_1_24;

public class ArrayReverse {
	public static void revArray(int a[]) {
	
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		
	}
	public static void orgArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5};
		//orgArray();
		revArray(a);
		orgArray(a);
		
	}

}


/*public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(array);

        reverseArray(array);

        System.out.println("Reversed Array:");
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}*/
