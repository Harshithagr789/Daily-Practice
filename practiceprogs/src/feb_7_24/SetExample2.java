package feb_7_24;
import java.util.*;
public class SetExample2 {
	public static void main(String[] args) {
		SetExample e1=new SetExample("hars",123456789l);
		SetExample e2=new SetExample("sush",123456789l);
		Set<SetExample> s=new HashSet();
		s.add(e1);
		s.add(e2);
		//s.addAll(e1,e2);
		System.out.println(s);
		if(e1.equals(s)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
