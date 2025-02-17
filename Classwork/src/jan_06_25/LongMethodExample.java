package jan_06_25;
import java.util.*;

public class LongMethodExample {
	public static void main(String[] args) {

		Long l1 = Long.getLong("18");
		Long l2 = Long.getLong("23", l1);
		Long l3 = Long.max(l1, l2);
		Long l4 = Long.reverse(l1);
		Long l5 = Long.rotateLeft(l2, 1);
		//Long l6 = Long.hashCode(12345);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		//System.out.println(l6);
		//System.out.println(l1);

	}

}
