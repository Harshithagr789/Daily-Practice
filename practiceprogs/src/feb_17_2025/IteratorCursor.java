package feb_17_2025;

import java.util.*;

public class IteratorCursor {
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			list.add(i);

		}
		System.out.println(list);
Iterator itr=list.iterator();
while(list.hasNext()) {
	Integer i=(Integer)((Iterator) list).next();
	if(list%2==0) {
		System.out.println(list);
	}else if(list.remove(i)) {
		System.out.println(list.remove(i));
	}
	
}
	}

}
