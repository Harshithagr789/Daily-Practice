package feb_11_2025;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(100, "harshitha");
		map.put(101, "panda");
		map.put(102, "ruchi");
		map.put(100, "mrudula");
		map.put(null, "ravi");
		map.put(null, "shake");
		String name = map.get(100);
		map.remove(101);
		System.out.println(name);
		System.out.println(map.get(100));
		System.out.println(map);
		System.out.println(map.remove(101));
		
		for (Integer l : map.keySet()) {
			System.out.println(map.keySet());
			System.out.println(l);
		}
		for (String a : map.values()) {
			System.out.println(map.values());
			System.out.println(a);
		}
		for (Map.Entry<Integer, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());

		}
		

	}

}
