package dec_3_2024;

public class LivingOrganism implements Acquatic,Ground {
	public static void main(String[]args) {
//this is used when we give public static viod method name for dii interfaces we will use like this(interface name variable=new class name(); variable.method name())
		Acquatic a=new LivingOrganism();
		a.waterAni();
		Ground g=new LivingOrganism();
		g.landAni();
//when we use static key word for 2 diff interfaces under same package with diff method name then we print like this(interface name.method name())		
		Ground.landAni();
		Acquatic.waterAni();
		LivingOrganism l=new LivingOrganism();
		l.cat();
		l.cat();
		Ground.super.cat();
		Acquatic.super.cat();
		
		
		}
	}
	
//@override is used when two diff interfaces within same package, same default method is used that time we shld use override with super keyword only for same default method in 2 diff interfaces  
		public void waterAni() {
			Ground.super.waterAni();
			Acquatic.super.waterAni();//super used to call the default methods
			//if we are using for two interface same default method we use override method
			System.out.println("its not breathing");
		}
		}
	


