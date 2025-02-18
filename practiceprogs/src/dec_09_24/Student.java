package dec_09_24;

public class Student {
	//learning(int i.String s){
		int id;
		String name;
		public Student(int i,String n){
		id=i;
		name=n;
}
	

	
	public static void main(String[]args) {
		Student t=new Student(1,"harshi");
		Student s1=new Student(2,"megha");
		System.out.println(t.id+" "+t.name);
		
		
	}

}
