package feb_14_2025;

public class SingleTonn {
	private static SingleTonn sn;

	private SingleTonn() {

	}

	public static SingleTonn getInstance() {
		if (sn == null) {
			 sn = new SingleTonn();
			//return sn;
		}
		return sn;
	}

	class Single{
		SingleTonn s1=SingleTonn.getInstance();
		SingleTonn s2=SingleTonn.getInstance();
		//System.out.println(s1==s2);
		
	}

}
