package dec_18_24;

public class StudentClass {
	public void CalculateAvg(int a[]) throws CusExcept  {
		int sum=0;
		int avg;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				throw new CusExcept("negative marking");
			}
			sum=sum+a[i];
			
		}
		avg=sum/500;
		System.out.println(avg);
	}
	public static void main(String[]args) throws CusExcept {
		int a[]= {10,-20,30,40,50};
		StudentClass x=new StudentClass();
		x.CalculateAvg(a);
		
	}

}
