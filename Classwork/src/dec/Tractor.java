package dec;

public interface Tractor {
	public void Company();
	public void Model();

}
class color implements Tractor{
	public void Company() {
		System.out.println("mahindre");
	}
	public void Model() {
		System.out.println("s23");
	}
}
class coloursss implements Tractor{
	public void Company() {
		System.out.println("black");
		
	}
	public void Model() {
		System.out.println("blue");
	}
}
class colorss {
	color c=new color();
	
	coloursss s=new coloursss();
	c.Company();
	s.Model();
	
	
	
}
