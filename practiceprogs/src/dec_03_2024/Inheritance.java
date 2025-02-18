package dec_03_2024;

public class Inheritance {
	public static void main(String[] args) {
///single inheritance		
		Mother m=new Mother();
		Son s=new Son();
		s.momRealtion();
		m.relationBtw();
		
///Multiple inheritance
		Instagram i=new Instagram();
		Story y=new Story();
		HighLights h=new HighLights();
		Instagram.socialMedia();
		Story.putStatues();
		h.fullTime();
		
///Hierarchial inheritance
		College c=new College();
		Cse e=new Cse();
		Mech a=new Mech();
		College.manyBranches();
		Cse.softWare();
		Mech.hardWare();
		
///MultiLevel(when we create 2 diff class that we have to store in derived class it shows thw complaiation error
		Hr z=new Hr();
		Manager y=new Manager();
		CoreNuts x=new CoreNuts();
		z.hrComp();
		y.manaComp();
		x.compDetails();
	}

}
