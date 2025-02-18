package feb_13_2025;

public class Animalss {
	private String name;
	private int age;
	private String Address;

	private Animalss() {
		System.out.println("hars");
		
		
	}
	private Animalss() {
		System.out.println("abs");
	}
	private class dog{
		private dog() {
			System.out.println("dogs bark");
		}
		
	}
	public static Animalss createOuter() {
		return new Animalss();
	}
	public void createInner() {
		dog d=new dog();
	}
	public static void main(String[] args) {
		//dog d=new dog();
		//Animalss a=new Animalss();
		Animalss a=Animalss.createOuter();
		a.createInner();
	}
//	
	}
     



