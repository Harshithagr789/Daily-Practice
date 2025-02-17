package jan_8_25;

public class UsingPrivate {
	private int age;
	private String name;

	public void setAge(int age) {
		this.age = age;

	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "UsingPrivate [age=" + age + ", name=" + name + "]";
	}

}
