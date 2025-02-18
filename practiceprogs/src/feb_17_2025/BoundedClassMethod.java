package feb_17_2025;

public class BoundedClassMethod <T extends GenericsClassMethod>{
	public static void main(String[] args) {
		
		GenericsClassMethod<Integer> clss=new GenericsClassMethod(123);
		GenericsClassMethod<String> clss1=new GenericsClassMethod("mrududla");
		
		clss.addMethod();
		clss1.addMethod();
		
		
		
	}
	

}
