package feb_06_24;

public class SetEmployee {
	private String name;
	private int id;
	
	
	public int getid() {
		return id;
	}
	public String name() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return "SetEmployee[id="+id+",name="+name+"]";
		
	}

}
