package dec_03_2024;

public class ReversePal {
	public boolean palRev(String b) {
		String rev=" ";
		for(int i=b.length()-1;i>0;i--) {
			rev+=b.charAt(i);
			if(b.equals(rev)) {
				return true;
			}
		}
		return false;
		
		
		
	}
	public static void main(String[] args) {
		String b="mom";
		ReversePal p=new ReversePal();
		p.palRev(b);
		System.out.println(p.palRev(b));
		
	}

}
