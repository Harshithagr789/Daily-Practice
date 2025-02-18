package Programs;

public class insideloops {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
////			System.out.println(i + "<- i value");
//			for (int j = 0; j < i; j++) {
////				System.out.println(j + "<-j Value" + i + "<-i value");
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "<- i value");
			for (int j = 0; j < i; j++) {
				System.out.print(j + "<-j Value" + i + "<-i value");
			}
			System.out.println();
		}
//
//	}
	}
}
