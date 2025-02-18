package feb_14_2025;
import java.util.*;
public class HashMapEqual {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap();
	map.put(1, "abc");
	//map.put(2, "bcd");
	//map.put(3, "cde");
	Map<Integer,String> map1=new HashMap();
	map1.put(1, "abc");
	if(map.equals(map1)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
