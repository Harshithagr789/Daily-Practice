package nov_14_2024;

public class Reverse {
public void revNum() {
	int n=12345;
	int rev=0;
	int temp;
	temp=n;
	while(n!=0) {
		rev=rev*10+n%10;
		n=n/10;
		
	}
	System.out.println(rev);
	
}
public static void main(String[]args) {
	Reverse r=new Reverse();
	r.revNum();
}
}
