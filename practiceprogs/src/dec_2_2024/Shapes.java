package dec_2_2024;

public interface Shapes {
	public void draw();
	public void write();
	

}
class Rectangle implements Shapes{
	public void draw() {
		System.out.println("box");
	}
	public void write() {
		System.out.println("line");
	}
}
class Triangle implements Shapes{
	public void draw() {
		System.out.println("triangleshape");
	}
	public void write() {
		System.out.println("Straightline");
	}
}
class Square implements Shapes{
	public void draw() {
		System.out.println("squareshape");
	}
	public void write() {
		System.out.println("wromgline");
	}
}
class all{
	public static void main(String[] args) {
		
	
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	Square s=new Square();
	r.draw();
	r.write();
	t.draw();

	t.write();
	s.draw();
	
	s.write();
	}
}
