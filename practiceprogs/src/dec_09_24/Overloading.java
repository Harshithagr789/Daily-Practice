package dec_09_24;

public class Overloading {
	public boolean addS(String a,String b) {
		return true;
	}
public int addS(int a,int b,int c) {
	return a*b*c;
	
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	boolean p=o.addS("Harshitha", "Mrudula");
	int x=o.addS(10,20, 30);
	System.out.println(o.addS("Harshitha", "Mrudula"));
	System.out.println(o.addS(10,20, 30));new String("b");new String("b");
	System.out.println(p);
	System.out.println(x);
}
}
