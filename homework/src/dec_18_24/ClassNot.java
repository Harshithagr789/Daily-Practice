package dec_18_24;

public class ClassNot {
	public static void notFound() throws ClassNotFoundException {
		//String s[]= {"java.util.String","java.util.HashMap","java.util.Scanner");
		try {
			Class.forName("java.util.Add");
			System.out.println("found a class");
			
		}
		catch(ClassNotFoundException s) {
			System.out.println(s.getMessage());
			throw s;
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
			notFound();
		 
			// TODO Auto-generated catch block
			//catch (ClassNotFoundException e) {e.printStackTrace();
		
	}

}
