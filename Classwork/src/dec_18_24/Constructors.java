package dec_18_24;

public class Constructors {
	public Constructors() {
		System.out.println("default constructor");
	}
	public Constructors(String a,String b) {
		this();
		System.out.println("cat");
		System.out.println(a.concat(b));
	}
	public Constructors(String x,String y,String z) {
		this("a","b");
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Constructors c=new Constructors();
		Constructors w=new Constructors("a","b");
		Constructors r=new Constructors("x","y","z");
	}

}
