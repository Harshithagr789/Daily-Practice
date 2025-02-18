package gcd;

public class CountNumOfCharacters {
	static void countChar() {
		String a="harshitha";
		int count=0;
		/*for(int i=0;i<a.length();i++) {
			for(int j=i;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
				else {
					
				}
			}*/for(int i=0;i<a.length();i++) {
			    
		        for(int j=i;j<a.length();j++) {
		            if(a.charAt(i)==a.charAt(j)) {
		            count++;    
		            }else {
		                
		            }
		            //System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
		        }
			System.out.println("Total number of count of occurance of "+a.charAt(i)+"is"+count);

		}
		
		
		//System.out.println(a.charAt(h));
		
	}
public static void main(String[]args) {
	countChar();
}
}
