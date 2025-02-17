package feb_06_24;

import java.util.HashSet;
import java.util.*;


public class SetEmployeeController {
	public static void main(String[] args) {
		SetEmployee e=new SetEmployee();
		e.setId(21);
		e.setName("har");
		SetEmployee e1=new SetEmployee();
		e1.setId(23);
		e1.setName("ruhi");
		SetEmployee e2=new SetEmployee();
		e2.setId(23);
		e2.setName("ruhi");
		Set<SetEmployee>s=new HashSet<>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e2);
		System.out.println(s);
		System.out.println(s.contains(e1));
		System.out.println(s.addAll(s));
		System.out.println(s.retainAll(s));
		for(SetEmployee a1:s) {
			if(a1.getid()==21) {
				System.out.println(a1.getid());
			}
			System.out.println(a1);
			
		}
		
		Set<Integer> q=new HashSet<>();
		q.add(1);
		q.add(2);
		q.add(2);
		System.out.println(q);
		
		
		//System.out.println(.getId());
		
		
	}

}
