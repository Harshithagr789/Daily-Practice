package dec_03_2024;

public class ReverseString {
	public boolean revStr(String a) {
		String rev=" ";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		return true;
		
	}
	public static void main(String[] args) {
		String a="harshi";
		ReverseString r=new ReverseString();
		r.revStr(a);
		System.out.println(r.revStr(a));

}
}
