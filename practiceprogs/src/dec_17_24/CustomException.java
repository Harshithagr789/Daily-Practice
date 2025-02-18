package dec_17_24;

public class CustomException extends Exception{
	
	public CustomException(String s) {
		super(s);
	}
}
 class TestCustom{
	 public static void valid(int age)throws CustomException {
		 if(age>18) {
			 throw new CustomException("not eligibe to vote");
		 }else {
			 System.out.println("eligible vote");
		 }
	 }
	 public static void main(String[] args) {
		try {
			valid(13);
		}
		catch(CustomException e) {
			System.out.println("caught the exception");
			System.out.println(e);
		}
		System.out.println("its not correct");
	}
	
}
 
	