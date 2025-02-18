package nov_6;

public class pattern {
	public static void pattern1N() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public static void pattern2N() {
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public static void pattern3N() {
		for(int i=0,p=-1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				p+=2;
				System.out.print(p +" ");
			}
			System.out.println();
		}
	}
	public void pattern4N() {
		for(int i=0,p=-1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				
				p+=2;
				System.out.print(p +" ");
			}
			for(int k=0;k<=4;k++) {
				System.out.println("");
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		
		pattern1N();
		pattern2N();
		pattern3N();
		pattern p=new pattern();
		p.pattern4N();
	}

}
