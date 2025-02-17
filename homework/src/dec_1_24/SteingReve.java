package dec_1_24;

public class SteingReve {
	public void revStr() {
		String a="harshitha";
		String rev=" ";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[]args) {
		SteingReve s=new SteingReve();
		s.revStr();
	}

}
