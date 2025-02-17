package nov_19_2024;
import java.util.*;

import java.util.Arrays;


public class Work {
	
		
			
			static int checkNeg(int arr[]) {
		        int count=0;
		        int minPosNeg=1;
		        int minPos=1;
		        for(int i=0;i<arr.length;i++) {
		            if (arr[i] < 0) { // 1 3 6 4 1 2
		                count++;
		            } else if (arr[i] > 0) {
		                if (arr[i] == minPos) {
		                    minPos++;
		                }
		            }
		        }
		            if(count==arr.length) {
		                return minPosNeg;
		            }else {
		                return minPos;
		            }
		    }



		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter size:");

		        int size = sc.nextInt();

		        int[] arr = new int[size];
		        System.out.println("enter values:");

		        for(int i=0;i<size;i++) {

		            arr[i]=sc.nextInt();

		        }

		        Arrays.sort(arr);

		        System.out.println("the small number:"+Work.checkNeg(arr));

		        sc.close();

		    }



		
		
		
		
	}

