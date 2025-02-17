package dec_13_24;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Checkedexp {
	public void checkedExp() throws FileNotFoundException{
	 File f=new File("C:\\Users\\harsh\\OneDrive\\Documents\\java shortcuts.txt");
	 BufferedReader br=new BufferedReader(f);
		String a=null;
		while((a=br.readLine())!=null) {
			System.out.println(f);
		}
	}

}
