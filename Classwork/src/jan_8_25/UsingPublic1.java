package jan_8_25;
import java.util.*;
public class UsingPublic1 {
	public static void main(String[] args) {
		List<UsingPublic>l=new ArrayList<>();
		UsingPublic u1=new UsingPublic(21,"hars",1);
		UsingPublic u2=new UsingPublic(22,"mru",2);
		UsingPublic u3=new UsingPublic(22,"ruchi",3);
		l.add(u1);
		l.add(u2);
		l.add(u3);
		for(UsingPublic u4:l) {
			if(u4.age==21) {
				System.out.println(u1);
				
			}
		}
		
	}

}
