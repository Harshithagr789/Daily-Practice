package numberprgms;

public class PrimeNum {
 public static void priNum() {
	 int n=50;
	 int count=0;
	 for(int i=2;i<=n;i++) {
		 if(n%i==0) {
			 count++;
		 }
	 }
	 if(count>2) {
		 System.out.println(n +"is not a plindrome");
	 }else {
		 System.out.println(n +"is palindrome");
	 }
	 
 }
 public static void main(String[]args) {
	 priNum();
 }


}
