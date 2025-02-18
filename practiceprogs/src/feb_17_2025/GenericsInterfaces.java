package feb_17_2025;
import java.util.*;
public class GenericsInterfaces {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("abc");
		//list.add(12);
		list.add("gce");
		String a=(String) list.get(0);
		
		//String value=list.get(1);
		String value=list.get(0);
		System.out.println(list);
		System.out.println(value);
		String valuee=list.get(0);
		System.out.println(a);
		
	
	
	}	

}
