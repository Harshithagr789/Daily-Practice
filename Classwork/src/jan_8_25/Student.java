package jan_8_25;

public class Student {
	public int id;
	public String name;
	public int age;

	public Student() {

	}

	public Student(int id, String name, int age) {
		// if(age>0) {
		this.id = id;

		this.name = name;
		if (age > 0) {
			this.age = age;
		}
	}

	// getter setter methods
	public void setAge(int age) {
		this.age = age;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
