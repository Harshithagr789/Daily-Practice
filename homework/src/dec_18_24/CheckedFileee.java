package dec_18_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CheckedFileee {
	public void fileNot() throws IOException {
		try {
			File f = new File("C:\\Users\\harsh\\Downloads\\.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				throw new IOException();

			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		CheckedFileee c = new CheckedFileee();
		try {
			c.fileNot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
