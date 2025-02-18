package feb_7_24;

public class ConstructorOverloding {
	private String name;
	private int id;
	private long phno;
	private String address;
	public ConstructorOverloding(String name,int id) {
		System.out.println("abs");
		this.name=name;
		this.id=id;
	}
	public  ConstructorOverloding(String address)
	{
		this.address=address;
	}
	public ConstructorOverloding(long phno) {
		this.phno=phno;
	}
	public static void main(String[] args) {
		ConstructorOverloding a=new ConstructorOverloding("harshitha",1);
		ConstructorOverloding b=new ConstructorOverloding("HopeFarm");
		ConstructorOverloding c=new ConstructorOverloding(7899986672l);
		System.out.println(a.name);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	
	

}
