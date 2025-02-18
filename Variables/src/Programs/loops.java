package Programs;

public class loops {
	public static void main(String[] args) {
		/*
		 * int a=2; for(int i=1;i<=10;i++) { int b=a*i;
		 * System.out.println("2*"+i+"="+b); }
		 */
		/*
		 * int i=1; int a=2; int b=a*i; while(i<=10) {
		 * 
		 * System.out.println(2+"*"+i+"="+b); i++; }
		 */
		/*
		 * int i=0; int a=3; do {
		 * 
		 * System.out.println(3+"*"+i+"="+(a*i)); i++; } while(i<=10);
		 */
		/*
		 * int a=2; int i=1; int b; for(i=1;i<=10;i++) { System.out.println(a*); }
		 */

		/*
		 * int a=100; for(int i=0;i<30;i++) { if(a<=90) { System.out.println(a); } else
		 * if(a<=75&&89<a){ System.out.println();
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * for(char c='A';c<='Z';c++) {
		 * System.out.println("character"+""+c+""+(int)c+"");
		 * 
		 * }
		 */
		/*
		 * for (int i = 0; i < 10000; i++) { if (i %2 == 0) { System.out.println(i +
		 * "even num");
		 * 
		 * } else { System.out.println(i + "odd num"); } } int i=1; while(i<1000) {
		 * if(i%2==0) { System.out.println(i+"even"); i--; } else {
		 * System.out.println(i+"odd"); i--; } }
		 */
		 
		/*
		 * int a = 3; do { if (a % 2 != 0) { System.out.println(a + "odd"); } a++; }
		 * while (a < 100);
		 */

		/*int b = 4;
		do {
			if (b % 1 == 0 && b % b == 0) {
				System.out.println(b + "prime");

			}

		} while (b > 5);*/

		/*for (int c = 2; c <= 4; c++) {
			if (c % 2 == 0) {
				System.out.println(c + "prime");
			}
		}*/
		int n=10;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				
			}
			if(count>2) {
				System.out.println(n+"prime");
			}
			else {
				System.out.println(n+"not prime");
			}
		}
		
	}

}
