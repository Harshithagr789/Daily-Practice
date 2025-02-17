package nov_19_2024;

public class Methods {
	static String s="Harshitha";
	static String b="mrudula";
	static void name() {
		
	
	
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	
	}
	static void num() {
		for(int i=0;i<s.length();i+=2) {
			System.out.print(s.charAt(i));		}
		
	
	/*for(int i=1;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}*/
	}
	static String reverse(String s) {
		String a="";
		for(int i=s.length()-1;i>=0;i-=2) {
			//System.out.println(s.charAt(i));
		a=a+s.charAt(i);
		}
		return a;
		
	}
	public static void main(String[]args) {
		name();
		num();
		String s=reverse("Harshitha");
		System.out.println(s);
		revName();
		
		
	}
	/*public static void main(String[]args) {
	for(int i=10;i>0;i--) {
		System.out.println(i);
	}
	}*/
	static void revName() {
		System.out.println(s.lastIndexOf("a"));
	    System.out.println(s.concat("harshi"));
	    System.out.println(s.indexOf("r"));
	    System.out.println(s.compareTo(b));
	    System.out.println(s.isEmpty());
	    System.out.println(s.codePointAt(4));
	    System.out.println(s.startsWith("h"));
	    System.out.println(s.indent(5));
	    System.out.println(s.indexOf("har", 0, 2));
	   
	    
	    
	}

}
