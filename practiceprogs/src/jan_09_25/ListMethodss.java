package jan_09_25;
import java.util.*;
public class ListMethodss {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(0,10);
	System.out.println(l);
	l.addAll(1,l);
	System.out.println(l);
	l.remove(0);
	System.out.println(l);
	l.indexOf(30);
	System.out.println(l);
	l.lastIndexOf(20);
	System.out.println(l);
	l.get(0);
	System.out.println(l);
	l.set(0,10);
	System.out.println(l);
	
}
}
