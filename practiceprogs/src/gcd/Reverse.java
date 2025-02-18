package gcd;

public class Reverse {
	static void revNum() {
		String s="harshi is bad giri";
		String rev=" ";
		String[] word=s.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			/*for(int j=s.length()-1;j>=0;j--) {
				rev+=s.charAt(j);
			}*/
			//String wordRev=new StringBuilder(word[i]).reverse().toString();
			//rev+=wordRev;
			  String reversedWord = new StringBuilder(word[i]).reverse().toString();
		        rev += reversedWord;
			rev+=word[i];
			if(i!=0) {
				rev+=" ";
			}
		}
		System.out.println(rev);
		
	}	
	//
	static void palNum() {
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s +"ia palindrome");
		}else {
			System.out.println(s +"is not a palindrome");
		}
	}//
	static void swapNum() {
		String b="harshi";
		String a="putty";
		/*String temp="";
		temp=b;
		b=a;
		a=temp;*/
		//************or
		
		b = b + a;
        
        a = b.substring(0, b.length()-a.length());
         
        b = b.substring(a.length());
		System.out.println(b);
		System.out.println(a);
		
	}
	
	//
	
	static void upperCase() {
		String q="harshitha";
		String p="PUTTY";
		System.out.println(q.toUpperCase());
		System.out.println(p.toLowerCase());
		System.out.println(q.charAt(1));
		System.out.println(q.indexOf(q));
		//System.out.println(q.);
		
	}
	public static void main(String[]args) {
		//revNum();
		//palNum();
		//swapNum();
		upperCase();
	}
}
//reverse string
/*package gcd;

public class Reverse {
    static void revString() {
        String s = "harshi";
        String reversed = "";

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {
        revString();
    }
}
*/

