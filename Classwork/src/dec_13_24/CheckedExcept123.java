package dec_13_24;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExcept123 { 
	public static void main(String[]args)   {
		reedFile();
	}
	private static void reedFile()  {

	try {
			File f=new File("C:\\Users\\harsh\\OneDrive\\Documents\\java shortcuts.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String s;
			while((s=br.readLine())!=null) 
			System.out.println(f);
	}
	catch(FileNotFoundException e){
		System.out.println(e.getStackTrace());
		
	}
	catch(IOException e1) {
		System.out.println(e1.getMessage());
	}
			
		}
		
	}
	

