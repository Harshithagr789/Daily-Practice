package feb_13_2025;

public class CustomClassExample {
	
		
	
	String name;
	int age;
	int usn;
	long phno;
	
	
	public  CustomClassExample(String name,int age,int usn,long phno) {
		this.age=age;
		this.name=name;
		this.usn=usn;
		this.phno=phno;
		
	
	
	}
	public String toString() {
		return "CustomClassExample[name="+name+",age="+age+"]";
	}
	
//	return "SetEmployee[id="+id+",name="+name+"]";
	
	
}
