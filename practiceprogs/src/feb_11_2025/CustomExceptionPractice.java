package feb_11_2025;

public class CustomExceptionPractice extends Exception {
	public CustomExceptionPractice(String s) {
		super(s);

	}

	class EligibalToVote {
		public static void ageAboveEighteen(int age) throws CustomExceptionPractice {
			if (age > 18) {
				throw new CustomExceptionPractice("can eligibal to vote");

			}else {
				System.out.println("not eligibal to vote");
			}

		}

	}
	public static void main(String[] args) {
		try {CustomExceptionPractice
			//EligibalToVote c=new EligibalToVote();
			//CustomExceptionPractice c=new CustomExceptionPractice();
			ageAboveEighteen(21);
		}
		catch(CustomExceptionPractice e) {
			System.out.println(e);
			
		}
	}

}
