package nov_14_2024;

public class Fact {
	public void factNum() {
		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
			
		}
		System.out.println(fact);
	}
public static void main(String[]args) {
	Fact f=new Fact();
	f.factNum();
	
}
}
