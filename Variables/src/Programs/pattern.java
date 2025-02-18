package Programs;

public class pattern {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < n; i++) { for (int j = i; j < n; j++) {
		 * System.out.print(" "); } for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); } for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); } System.out.println();
		 * 
		 * }
		 * 
		 * for (int i = 0; i < n; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print(" "); } for (int j = i; j < n; j++) { System.out.print("*");
		 * } for (int j = i; j < n; j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		//

		/*
		 * for(int i=0;i<n;i++) { int p=1; for(int j=i;j<n;j++) { System.out.print(p++
		 * +" "); } System.out.println();
		 * 
		 * }
		 */

		//

		/*
		 * for(int i=0,p=1;i<n;i++,p++) { for(int j=0;j<n;j++) {
		 * System.out.print(p+" "); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * for(int i=0;i<=n;i++) { int p=5; for(int j=0;j<=i;j++) { System.out.print(p--
		 * +" "); } System.out.println(); }
		 */

		//

		/*
		 * for(int i=0,p=0;i<=4;i++,p+=2) {
		 * 
		 * 
		 * for(int j=0;j<=i;j++) { if(i%2==0) { System.out.print("@"); }else
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */

		/*
		 * for(int i=0;i<=4;i++) { int p=1; for(int j=1;j<=i;j++) {
		 * System.out.print(" "); } for(int j=i;j<=4;j++) { System.out.print(p++ ); }
		 * System.out.println(); }
		 */
		/*
		 * for(int i=1;i<=5;i++) { int p=1; for(int j=i;j<=5;j++) {
		 * System.out.print(" "); } for(int j=0;j<=i;j++) { System.out.print(p++ +" ");
		 * } for(int j=0;j<=i;j++) { System.out.print(p++ +" "); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * for(int i=0,p='A';i<=4;i++,p--) { for(int j=0;j<=i;j++) {
		 * System.out.print((char)p+""); } System.out.println(); }
		 */

		/*
		 * // pattern 1 printing multiple of two or increasing 2 int p = 0; for (int i =
		 * 0; i <= 3; i++) { for (int j = 0; j <= 3; j++) { p += 2; System.out.print(p +
		 * " "); } System.out.println(); }
		 * 
		 * // pattern 2 printing star from increasing order
		 * 
		 * for (int i = 0; i <= 3; i++) { for (int j = 0; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * // pattern 3 priting star from decreasing order
		 * 
		 * for (int i = 0; i <= 3; i++) { for (int j = i; j <= 3; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * // pattern 4 printing consecutive number in decresing order for (int i = 0; i
		 * <= 3; i++) { int q = 1; for (int j = i; j <= 3; j++) { System.out.print(q++ +
		 * "");
		 * 
		 * } System.out.println(); }
		 * 
		 * // pattern 5 printing cosecutivie numbers from 1 to 20 int r = 0; for (int i
		 * = 0; i <= 3; i++) { for (int j = 0; j <= 4; j++) { r += 1; System.out.print(r
		 * + " "); } System.out.println(); }
		 * 
		 * // pattern 6 printing even numbers int a = 0; for (int i = 0; i <= 4; i++) {
		 * for (int j = 0; j <= i; j++) {
		 * 
		 * a += 2; System.out.print(a + " ");
		 * 
		 * } System.out.println(); } // pattern 7 printing odd numbers int b = -1; for
		 * (int i = 0; i <= 4; i++) { for (int j = 0; j <= i; j++) { b = b + 2;
		 * 
		 * System.out.print(b + " "); } System.out.println(); }
		 */
		// 1st question

		/*
		 * for(int i=0;i<=4;i++) { int p=5; for(int j=i;j<=4;j++) {
		 * 
		 * System.out.print(--p +" "); } System.out.println(); }
		 * 
		 * //2nd question int q=26; for(int i=0;i<=4;i++) { for(int j=0;j<=4;j++) {
		 * q-=1; System.out.print(q +" "); } System.out.println(); }
		 * 
		 * //3rd question int n=5; int count =0; for(int i=0;i<=n;i++) { if(i%n==0) {
		 * count++; break;
		 * 
		 * }
		 * 
		 * } if(count<2) { System.out.println(n +"prime"); } else { System.out.println(n
		 * +"not prime"); }
		 * 
		 * 
		 * //4th question for(int i=0;i<=100;i++) { if(i%2==0) { System.out.println(i
		 * +"even"); } else { System.out.println(i +"odd"); } }
		 */
		// 5th question
		/*
		 * for (int i = 100; i >= 1; --i) { if (i % 3 == 0 && i % 5 == 0) {
		 * System.out.println(i + "divisible by 3"); } else { System.out.println(i +
		 * "divisible by 5"); } } String s="Harshitha"; for(int i=0;i<100;i++) {
		 * System.out.println(s); }
		 */

		/*
		 * int n = 5; int count = 0; for (int i = 1; i <= n; i++) { if (n % i == 0) {
		 * count++;
		 * 
		 * 
		 * } }
		 * 
		 * if (count >2) { System.out.println(n + " not prime"); } else {
		 * System.out.println(n + " prime"); }
		 */
		/*
		 * int n=10; int fact=1; for(int i=1;i<=n;i++) { fact=fact*i;
		 * 
		 * } System.out.println(fact); }
		 */
		/*for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");

			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < 5; k++) {
				System.out.print("*");

			}
			for (int l = i; l <= 5; l++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("");
			}
			for(int k=i;k<5;k++) {
				System.out.print("*");
			}
			for(int l=i;l<=5;l++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// pattern 3 left triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		 
		
		
		
	}
}
