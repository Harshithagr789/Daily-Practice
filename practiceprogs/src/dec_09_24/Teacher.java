package dec_09_24;

public class Teacher {
	
		int id;
		String name;
		public  Teacher(int i,String n) {
			id=i;
			name=n;
			
			//System.out.println(id+""+name);
		}
	public static void main(String[] args) {
		Teacher t1=new Teacher(1,"harshi");
		//Teacher t2=new Teacher(2,"mrudula");
		System.out.println(t1.id+""+t1.name);
		
		
	}

}
