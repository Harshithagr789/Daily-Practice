package dec_3_2024;

public interface Math {
	static void addNum() {
		System.out.println("add num");
	}
	default void subNum() {
		System.out.println("sub num");
	}
	public void mulNum();
		
	

}

