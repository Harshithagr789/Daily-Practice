package jan_08_25;
import java.util.*;
import java.util.ArrayList;

public class CollectionsMethods {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		//Integer l=new Integer(5);
		List<Integer>l1=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(2,20 );
		l.addAll(1, l);
		l.remove(1);
		//l.removeAll(l);
		l.contains(l);
		l.addFirst(23);
		l.equals(10);
		l.get(0);
		l1.add(10);
		l1.indexOf(2);
		l.isEmpty();
		l.toArray();
		l.clear();
		System.out.println(l1);
		System.out.println(l);
		//System.out.println();
		
		
		
		
		
		
	}

}
