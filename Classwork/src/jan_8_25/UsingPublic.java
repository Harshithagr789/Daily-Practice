package jan_8_25;

public class UsingPublic {
	
		public int age;
		public String name;
		public int id;
		public UsingPublic(int age,String name,int id) {
			this.age=age;
			this.name=name;
			this.id=id;
			
		}
		@Override
		public String toString() {
			return "UsingPublic [age:"+age+"name:"+name+"id:"+id+"]";
		}
		
	

}
