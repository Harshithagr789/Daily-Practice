package jan_02_2025;

public class Over {
public static void main(String[] args) {
	
	Ani z=new Deer();//subclass holds parent class objects
	z.swim();
	Ani s=new Elephant();//here we can't hold the chid class in parent class we there it has diff methods so only its getting error
	s.sound();
	
	
}
	
}
