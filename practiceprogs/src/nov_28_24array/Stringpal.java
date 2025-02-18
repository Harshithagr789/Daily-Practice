package nov_28_24array;

public class Stringpal {
	public static void main(String[]args) {
	String s="moma";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println(rev +" "+"is pal");
	}else {
		System.out.println(rev +" "+"is not pal");
	}

}
}
