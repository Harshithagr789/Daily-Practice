package feb_11_2025;

public class PropagationException {
	void a() {
		int a=10;
	}
	void b() {
		a();
	}
	void c() {
		try{
			b();
		}
		catch(Exception e) {
			System.out.println(e);
			
		
		}
	}
	public static void main(String[] args) {
		PropagationException p=new PropagationException();
		p.c();
		System.out.println("propagation exception");
	}

}
