package feb_7_25;

import java.util.Objects;

public class EqualsandHashcodee {
	int stu_id;
	String name;
	
	 public EqualsandHashcodee(int id,String name){
		 this.stu_id=id;
		 this.name=name;
	 }
	 public void Setid() {
		 this.stu_id=stu_id;
	 }
	 public void Setname() {
		 this.name=name;
	 }
	 public int getId(int id) {
		 return id;
	 }
	 public String getName(String name) {
		 return name;
		 
	 }
	 public String toString() {
		 return "EqualsandHashcodee[id="+stu_id+"name="+name+"]";
	 }
	
		 
		 
	 
	/*@Override
	public int hashCode() {
		return Objects.hash(name, stu_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsandHashcodee other = (EqualsandHashcodee) obj;
		return Objects.equals(name, other.name) && stu_id == other.stu_id;
	}*/
}
