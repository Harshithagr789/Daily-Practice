package feb_11_2025;

import java.util.*;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet<Integer> sort = new TreeSet();
		sort.add(10);
		sort.add(20);
		sort.add(30);
		sort.add(40);
		System.out.println(sort);
		System.out.println(sort.first());
		System.out.println(sort.getFirst());
//	System.out.println(sort.addFirst(23));
		System.out.println(sort.getLast());
		System.out.println(sort.headSet(20));
		System.out.println(sort.tailSet(30));
		System.out.println(sort.subSet(10,30 ));
	}

}
