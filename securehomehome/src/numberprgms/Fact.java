package numberprgms;

public class Fact {
public static void factNum() {
	int n=4;
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
		
	}
	System.out.println(fact);
}
public static void main(String[] args) {
	factNum();
}
}
