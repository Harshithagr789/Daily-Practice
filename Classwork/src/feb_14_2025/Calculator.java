package feb_14_2025;
import java.util.*;

import feb_7_25.EqualsandHashcodee;
public class Calculator <T>{
	private T value;
	public Calculator(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
public static void main(String[] args) {
	Calculator c=new Calculator(30);
	Calculator c1=new Calculator("hi");
	System.out.println(c.getValue());
	System.out.println(c1.getValue());
	List<String> list=new ArrayList();
	list.add("har");
	list.add("abc");
	//list1.add("mxd");
	//list.add(1);
	String str=(String)list.get(1);
	System.out.println(str);
	List list1=(List)new ArrayList();
	list1.add(12);
	list1.add(23);
	list1.add(new  EqualsandHashcodee(2,"harshitha"));
	List<EqualsandHashcodee> list2=new ArrayList();
	list2.add(new EqualsandHashcodee(1,"harshitha"));
	list2.add(new  EqualsandHashcodee(2,"harshitha"));
	list1.add(list2);
	
	
}
}
