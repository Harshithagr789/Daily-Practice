package numberprgms;

public class FactorialNum {
	public void factNum() {
		
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		
			
		}
		System.out.println(fact);
	}
	public static void main(String[]args) {
		 FactorialNum f=new  FactorialNum();
		 f.factNum();
		
	}

}
