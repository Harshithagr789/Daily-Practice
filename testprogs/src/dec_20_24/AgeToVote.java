package dec_20_24;

public class AgeToVote {
	public static void voteing(int age) throws CustomExcept {
		try {
			if (age > 18) {
				throw new CustomExcept("eligible to not vote");

			} else {
				System.out.println("not eligible to vote");
			}
		} catch (CustomExcept c) {
			System.out.println(c.getMessage());
		}
		
	}

	public static void main(String[] args) throws CustomExcept {
		try {
			voteing(25);
			System.out.println("ppl can't vote");
		} catch (CustomExcept c) {
			// TODO Auto-generated catch block
			System.out.println(c.getStackTrace());
		}

	}

}
