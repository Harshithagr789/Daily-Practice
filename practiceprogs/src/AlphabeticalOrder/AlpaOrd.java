package AlphabeticalOrder;

import java.util.Arrays;

public class AlpaOrd {
	public static void arrange() {
		String a[]= {"panda","harshitha","ruchitha","mrudula"};
		String b[]= {"","","",""};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			char c[]=a[i].toCharArray();
		Arrays.sort(c);
		a[i]=new String(c);
		
		
		
		}	
		System.out.println(Arrays.toString(a)); 
	}	
	public static void main(String[] args) {
		arrange();
	}

}
