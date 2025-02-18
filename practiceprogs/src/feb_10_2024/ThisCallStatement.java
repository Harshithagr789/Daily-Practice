package feb_10_2024;

public class ThisCallStatement {
private String name;
private int usn;
private String address;
private long phnol;
private int id;
private float percentf;
private boolean result;
private String email;
private int sem;


public ThisCallStatement(String name ) {
	//this("hopefarm");
	//this(7899986672l);
	this.name=name;
}
public ThisCallStatement(int usn,String address) {
	this("harshitha");
	this.usn=usn;
	this.address=address;
	
}
public ThisCallStatement(int usn,String address,long phnol) {
this(68,"hopefarm");
	this.phnol=phnol;
	
}
public ThisCallStatement(long phnol) {
	
	this.id=id;
}
public ThisCallStatement(int id,float percent) {
	this(7899986672l);
	this.id=id;
	this.percentf=percent;
	
}
public ThisCallStatement(int id,float percent,boolean result) {
	this(1,0.0f);
	this.result=result;
}
public ThisCallStatement() {
	// TODO Auto-generated constructor stub
}
public void SetId(int id) {
	this.id=id;
	
	
}
public void SetName(String name) {
	this.name=name;
}
public String toString() {
	return "ThisCallStatement[id="+id+",name="+name+"]";
			
			
}
public static void main(String[] args) {
//	ThisCallStatement s=new ThisCallStatement("harshitha");
//	ThisCallStatement s1=new ThisCallStatement(68,"hopefarm");
//	ThisCallStatement s2=new ThisCallStatement(7899986672l);
//	ThisCallStatement s3=new ThisCallStatement(1,0.0f);
	ThisCallStatement s4=new ThisCallStatement();
	s4.SetId(11);
	s4.SetName("panda");
	System.out.println(s4);
	
	
	
	
	
//	System.out.println(s.name);
//	System.out.println(s1.usn+" "+s1.address);
//	System.out.println(s2.phnol);
//	System.out.println(s3.id+" "+s3.percentf);
	//System.out.println(s.phnol);
}
	
}
