package dec_13_24;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class  Exptin{
	public static void main(String[]args) throws IOException {
		readFile();
	}
	private static void readFile() throws IOException {
		// TODO Auto-generated method stub
		 
		File file = new File("C:\\Users\\harsh\\OneDrive\\Documents\\java shortcuts.txt");

		        // Note:  Double backquote is to avoid compiler
		        // interpret words
		        // like \test as \t (ie. as a escape sequence)

		        // Creating an object of BufferedReader class
		        BufferedReader br= new BufferedReader(new FileReader(file));

		        // Declaring a string variable
		        String st;
		        // Condition holds true till
		        // there is character in a string
		        while ((st = br.readLine()) != null)

		            // Print the string
		            System.out.println(st);
		
		}
		}
	//	return null;
	
	


