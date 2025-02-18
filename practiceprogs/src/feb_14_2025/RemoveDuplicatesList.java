package feb_14_2025;
import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicatesList {
	public static void removeDuplicate(List<Integer> list){
		List<Integer> uniquelist=new ArrayList();
		for(Integer num:list) {
			if(!uniquelist.contains(num)) {
				uniquelist.add(num);
				
			}
			
		}
		System.out.println(uniquelist);
		
		//return uniquelist;
	
	}
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(10);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(30);
		list1.add(40);
		//List<Integer> uniquelsit=list1.stream().distinct().collect(Collectors.toList()); 
		//System.out.println(uniquelsit);
		System.out.println(list1);
		RemoveDuplicatesList.removeDuplicate(list1);
		
		//System.out.println(list1.remove());
		//List<Integer> result=removeDuplicate(list1);
		//System.out.println(result);
		//System.out.println(removeDuplicate(list1));
	}
	
	

}
