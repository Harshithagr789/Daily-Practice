package jan_06_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExa {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// Integer a[]= {2,4,8,2,1,8,9};
		// Collection.Sort(a);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(50);
		list.add(45);
		System.out.println(list.toString());
		System.out.println("max is" + " " + Collections.max(list));
		System.out.println("min is" + " " + Collections.min(list));
		Collections.sort(list);
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println("swap num" + " " + list);
		Collections.reverse(list);
		System.out.println("reverse num" + " " + list);
		List<String> s = Collections.nCopies(3, "hi");
		System.out.println(s);
		int a=10;
		Integer a1=a;//autoboxing will happen
		int b=a1;//auto unboxing will happen
		System.out.println(a1);
		float x=2.3f;
		Float x1=x;
		float y=x1;
		System.out.println(y);
		System.out.println(x1);
		double c=2.345d;
		Double c1=c;
		double d=c;
		System.out.println(d);
		char e='a';
		Character e1=e;
		char f=e1;
		System.out.println(e1);
		byte z=50;
		Integer s1=(int) z;
		System.out.println(s1);
		
		//we can store small value in big value like int in long
		//we cant store big value in small value like double in int or long in int here it will happen typecasting
		int i=10;
		long i1=i;
		
		
		
		

	}


}
