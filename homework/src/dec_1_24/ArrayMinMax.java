package dec_1_24;

import java.util.Arrays;

public class ArrayMinMax {
	public static void minMax() {
		int a[]= {1,34,76,06,36,98,33};
		int min=Integer.MAX_VALUE,thirdMin=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE,thirdMax=Integer.MIN_VALUE;
		int count=a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				thirdMax=max;
				max=a[i];
				
			}else if(a[i]>thirdMax && a[i]!=max) {
				thirdMax=a[i];
			}
			
		}
		System.out.println(max);
		System.out.println(thirdMax);
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				thirdMin=min;
				min=a[i];
			}else if(a[i]<thirdMin && a[i]!=min) {
				thirdMin=a[i];
			}
		}
		System.out.println(min);
		System.out.println(thirdMin);
	}
	public static void revMin() {
		int b[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(b);
		System.out.println(b[0]);
		System.out.println(b[b.length-1]);
		System.out.println(b[1]);
		System.out.println(b[b.length-2]);
		System.out.println(b[3]);
		System.out.println(b[b.length-4]);
		
	}
	public static void main(String[]args) {
		//minMax();
		revMin();
	}

}

/*package dec_1_24;

public class ArrayMinMax {
    public static void minMax() {
        int a[] = {1, 34, 76, 6, 36, 98, 33};

        // Initialize values for max and second max
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        // Initialize values for min and second min
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        // Iterate through the array to find max, second max, min, and second min
        for (int i = 0; i < a.length; i++) {
            // Update max and second max
            if (a[i] > max) {
                secondMax = max; // Update second max
                max = a[i];      // Update max
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }

            // Update min and second min
            if (a[i] < min) {
                secondMin = min; // Update second min
                min = a[i];      // Update min
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }

        // Print the results
        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secondMax);
        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + secondMin);
    }

    public static void main(String[] args) {
        minMax();
    }
}*/

