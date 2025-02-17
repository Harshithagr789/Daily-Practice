package dec;

public interface Birds {
	public void fly();

}
class Parrot implements Birds{
	public void fly() {
		System.out.println("peekpeek");
	}
	
}
class peacock implements Birds{
	public void fly() {
		System.out.println("cheekcheek");
	}
}
class crow implements Birds{
	public void fly() {
		System.out.println("caawww-caawww");
	}
}
class read{
	public static void main(String[] args) {
		Parrot p=new Parrot();
		peacock r=new peacock();
		crow c=new crow();
		p.fly();
		r.fly();
		c.fly();
	}
}