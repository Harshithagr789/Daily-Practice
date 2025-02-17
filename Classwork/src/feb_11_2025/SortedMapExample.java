package feb_11_2025;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap <Integer,String> sort=new TreeMap();
		sort.put(1,"harshitha" );
		sort.put(2, "panda");
		sort.put(3, "ruchi");
		sort.put(4, "mrudula");
		System.out.println(sort);
		System.out.println(sort.firstKey());
		System.out.println((sort.lastEntry()));
		System.out.println(sort.lastKey());
		System.out.println(sort.hashCode());
		System.out.println(sort.headMap(3));
		System.out.println(sort.tailMap(2));
		System.out.println(sort.comparator());
	}

}
