package feb_7_24;

public class Constructor {
	public Constructor() {
		System.out.println("it will work");
	}
	public void toys() {
		System.out.println("it wont work");
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		c.toys();
	}
	

}
