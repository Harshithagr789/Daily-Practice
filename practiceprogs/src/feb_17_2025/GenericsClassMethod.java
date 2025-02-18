package feb_17_2025;

public class GenericsClassMethod <T>{
 T a;
	public  GenericsClassMethod(T a) {
		this.a=a;
		
	}
	public   <T>void addMethod(){
		System.out.println("true");
		
	}

}
