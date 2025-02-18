package feb_14_2025;
import java.util.*;

public class SortingMap {
	public static void main(String[] args) {
		SortedMap<String,Integer> map=new TreeMap();
		SortingMap abd=new SortingMap();
		map.put("anki",1);
		map.put( "bhagya",2);
		map.put("ananya",4);
		map.put( "sush",5);
		map.put("nidhi",6 );
		System.out.println(map);
		//System.out.println(map.g));
		for(Map.Entry<String,Integer> entrySet:map.entrySet()){
		//String a=entrySet.getValue();
		System.out.println(entrySet.getValue());
	//	System.out.println(entrySet.getKey());
		
		}
		
		
	}
}
