package nov_29_2024;

public class ArrayMinMax {
	static void minMax() {
		int a[]= {1,2,3,4,5};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void main(String[]args) {
		minMax();
		
	}

}
