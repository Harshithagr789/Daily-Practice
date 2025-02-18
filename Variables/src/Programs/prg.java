package Programs;

public class prg {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println("the num divisible by 2 "+ i);
			}
			else if(i%3==0 && i%5==0) {
				System.out.println("the num divi by 3 n 5 "+ i);
			}
			i++;
			
		}
		while(i<=100);
		/*int a = 2;
		int i = 1;
		while (i <= 100) {
			if (i % a == 0) {
				System.out.println("the num divi by 2 " + i);
				
			}
			else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("the number divi by 3 n 5 is" + i);
				
			}
			i++;
		}*/

		/*
		 * for(int i=1;i<100;i++) { if(i%a==0) {
		 * System.out.println("it is divisible by 2"+ i ); } else if(i%3==0 && i%5==0) {
		 * System.out.println("the number is divisuble by 3 and 5"+ i); }
		 * 
		 * }
		 */
	}

}
