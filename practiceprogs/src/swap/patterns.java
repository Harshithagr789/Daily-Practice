package swap;

public class patterns {
	public static void main(String[]args) {
		int p='A';
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++) {
				p+=1;
				
				System.out.print(" ");
			}
			for(int k=i;k<=3;k++) {
				System.out.print((char)p+" ");
			}
			
		
		for(int l=i;l<=3;l++) {
			System.out.print((char)p+" ");
		}
		System.out.println();
	}

}
}
