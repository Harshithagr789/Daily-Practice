package feb_7_25;
import java.util.*;

public class EEqualsandHashcodee2 {
	public static void main(String[] args) {
		EqualsandHashcodee e=new  EqualsandHashcodee(1,"harshitha");
		 EqualsandHashcodee e1=new  EqualsandHashcodee(2,"harshitha");
		 Set<EqualsandHashcodee> q=new HashSet();
		 q.add(e);
		 q.add(e1);
		 System.out.println(q);
		 if(e.equals(e1)) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
			 
	}
	 
	
	 
	 

}
