package nov_25_2024;

public class Word {

	public static void main(String[]args) {
		//String s="Mahesh";
		//s="uma";
		String s=new String("mahesh");
		String s2="mahesh";
	
		
		System.out.println(s.equals(s));
		System.out.println(s==s2);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s.charAt(3));
		System.out.println(s.compareTo(s2));
		System.out.println(s2.concat(s));
		System.out.println(s2.equals(s));
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s2.contentEquals(s));
		System.out.println(s.contentEquals(s2));
		System.out.println(s.indexOf(3));
		
		
		
	
	}

}
