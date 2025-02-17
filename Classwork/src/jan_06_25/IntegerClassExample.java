package jan_06_25;

public class IntegerClassExample {
	public static void main(String[] args) {
		Integer i1=Integer.getInteger("hello");
		System.out.println(i1);
		Integer i2=Integer.getInteger("234",2 );
		Integer i3=Integer.getInteger("857", i2);
		Integer i4=Integer.sum(i1,i1 );
		Integer i5=Integer.valueOf(i4);
		Integer i6=Integer.valueOf("12");
		Integer i7=Integer.valueOf("2",2 );
		Integer i8=Integer.compare(i6,i7 );
		Integer i9=Integer.hashCode(64);
		Integer i10=Integer.max(i8, i9);
		Integer i11=Integer.min(i8, 19);
		Integer i12=Integer.reverse(i11);
		//Integer.
		//Integer i13=Integer.toString("40", 3);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(i8);
		System.out.println(i9);
		System.out.println(i10);
		System.out.println(i11);
		System.out.println(i12);
		//System.out.println(i13);		
		
		
	}

}
