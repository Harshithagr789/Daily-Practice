package dec_03_2024;

public class CountNum {
	public int numCou(int a[]) {
		int n=a.length;
		for(int i=0;i<=n;i++) {
			//return n;
		}
		return n;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		CountNum c=new CountNum();
		c.numCou(a);
		System.out.println(c.numCou(a));
	}

}
