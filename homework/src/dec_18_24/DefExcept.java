package dec_18_24;

public class DefExcept extends Exception{
	public DefExcept(String s) {
		super(s);
	}
	class SumAndAng{
		public static void CalAndSum(int a[]) throws DefExcept {
			int sum=0;
			int avg;
				for(int i=0;i<a.length;i++) {
			
				if(a[i]<0) {
					throw new DefExcept("nehative marks");
				}
				sum=sum+a[i];
				System.out.println(sum);
				
			}
		}
		public static void main(String[] args) throws DefExcept {
			int a[]= {1,-2,-3,4,5,6};
			//SumAndAng x=new SumAndAng();
			CalAndSum(a);
		}
	}

}
