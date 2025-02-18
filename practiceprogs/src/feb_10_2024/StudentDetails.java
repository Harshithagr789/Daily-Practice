package feb_10_2024;

public class StudentDetails {
	private String name;
	private int usn;
	private long phnol;
	public StudentDetails(String name,int usn) {
		//System.out.println("abc");
		this.name=name;
		this.usn=usn;
		
	}
	
	public StudentDetails(long phno) {
		this.phnol=phno;
	}
	
	
public static void main(String[] args) {
	StudentDetails s=new StudentDetails("harshitha",68);
	StudentDetails s1=new StudentDetails(7899986672l);
	System.out.println(s.name+" "+s.usn);
	System.out.println(s1.phnol);
	System.out.println(s.usn);
}
}
