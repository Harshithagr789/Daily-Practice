package dec;

public interface Bike {
	public void model();

}
public interface Car {
	public void company();

}
class Types implements Bike {
	public void model() {
		System.out.println("hero");
	}
	

}
class TypesOfarss implements Car {
	public void company() {
		System.out.println("BMW");
	}

}

class TwoWheeler {
	public static void main(String[] args) {
		TypesOfCar c=new TypesOfCar();
		Types t=new Types();
		t.model();
		c.company();
		
	}

}
