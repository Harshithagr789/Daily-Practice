package dec_3_2024;

public class X {
public static void main(String[] args) {
	//single
	Father f=new Father();
	Daughter d=new Daughter();
	f.inHer();
	d.secInher();
	
	//Hybrid
	Company c=new Company();
	HarshiGR h=new HarshiGR();
	MrudulaHegde m=new MrudulaHegde();
	c.coreNuts();
	h.fourthInher();
	m.hegMru();
	
	//Multiple 
	Animal a=new Animal();
	Dog g=new Dog();
	Pug p=new Pug();
	a.multiLevel();
	g.mutiLevel1();
	p.multiLevel2();
	
	//multi level(in this inheritance we cant use both super r base class in sub or derived class,so it shows compliation error
	Asection s=new Asection();
	BSection o=new BSection();
	Department t=new Department();
	s.cseSec();
	o.cseBsec();
	t.cseBsec();
	
}
}
