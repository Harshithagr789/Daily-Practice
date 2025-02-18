package jan_09_25;
import java.util.*;

public class Private123456 {
	public static void main(String[] args) {
		Private23 a=new Private23();
		a.setAge(18);
		a.setName("har");
		a.setId(1);
		List<Private23>l=new ArrayList<>();
		l.add(a);
		for(Private23 p3:l) {
			if(p3.getAge()<=18) {
				System.out.println(a.getAge());
				System.out.println(a.getName());
			}
		
		}
	}

}
