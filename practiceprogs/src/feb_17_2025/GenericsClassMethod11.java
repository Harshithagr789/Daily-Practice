package feb_17_2025;

public class GenericsClassMethod11 {
	public static void main(String[] args) {
		 GenericsClassMethod<String> gcm=new  GenericsClassMethod("harshitha");
		 GenericsClassMethod<Integer> gcm2=new  GenericsClassMethod(123);
		//String b=(String)gcm.addMethod();
		gcm2.addMethod();
		gcm.addMethod();
		System.out.println("false");
		//System.out.println((Integer)gcm2.addMethod());
		 
		 
		 
	}

}
