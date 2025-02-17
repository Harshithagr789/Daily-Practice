package dec_18_24;

public class UncheckExcep {
	public  void ioExcepts() throws ArithmeticException{
		int a;
		a=2/0;
		
		System.out.println(a);
		
	}
	public void arrayOut()throws ArrayIndexOutOfBoundsException {
		int a[]= {1,2,3,4};
		System.out.println(a[5]);
	}
	public  void numFor() {
		try{
			String s="harshi";
		
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			throw new NumberFormatException();
		}
	}
	public void nullPio() {
		try{
			String a=null;
		
		System.out.println(a.length());
		
		}
		catch(NullPointerException n) {
			System.out.println(n);
			throw new NullPointerException();
		}
	}
		
	public static void main(String[] args) {
		UncheckExcep u=new UncheckExcep();
		//u.ioExcepts();
		//u.arrayOut();
		u.numFor();
		//u.nullPio();
	}

}
