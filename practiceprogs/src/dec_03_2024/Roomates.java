package dec_03_2024;

public class Roomates implements Ankii,Bhagya {
	public static void main(String[] args) {
		Ankii a=new Roomates();
		Ankii.roomiEee();
		Bhagya b=new Roomates();
		Bhagya.rooMate();
		
//static
		Ankii.roomiEee();
		Bhagya.rooMate();
	}
}
		
//default
		public static roomiEee() {
			Ankii.super.roomiEee();
			Bhagya.super.roomiEee();
			System.out.println("they are very bad");
		}
		
		
	


