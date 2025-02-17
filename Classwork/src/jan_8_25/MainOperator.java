package jan_8_25;
import java.util.*;
import java.util.List;

public class MainOperator {
	public static void main(String[] args) {
		Student s=new Student(1,"harshitha",-22);
		Student s1=new Student(2,"mrudula",21);
		Student s3=new Student(3,"ruchi",21);
		Student s4=new Student(4,"panda",21);
		List<Student> l=new ArrayList<>();
		l.add(s);
		l.add(s3);
		l.add(s4);
		l.add(s1);
		for(Student s5:l) {
			if(s5.age>21) {
				/*System.out.println(s5.age);
				System.out.println(s5.name);
				System.out.println(s5.id);
				*/
				System.out.println(l);
				
				
			}
			
		}
	}
	

}
