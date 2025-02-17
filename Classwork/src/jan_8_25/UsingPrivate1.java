package jan_8_25;
import java.util.*;
public class UsingPrivate1 {
	public static void main(String[] args) {
UsingPrivate p=new UsingPrivate();
p.setAge(21);
p.setName("har");

		List<UsingPrivate> a=new ArrayList<>();
		a.add(p);
		for(UsingPrivate p3:a) {
			if(p3.getAge()==21) {
				System.out.println(p3.getAge());
				System.out.println(p3.getName());
				System.out.println(p3);
			}
		}
		System.out.println(a);
		
		
	}

}

