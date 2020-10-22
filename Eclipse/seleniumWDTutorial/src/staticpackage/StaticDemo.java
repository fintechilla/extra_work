package staticpackage;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExample s1 = new StaticExample("BMW");
		
		System.out.println("s1 make: " + s1.getCar() + " type: " + StaticExample.getType()) ;
		System.out.println("s1 instance: " + s1.getInstancesNum());

		StaticExample s2 = new StaticExample("BMW");
		System.out.println("s2 make: " + s2.getCar() + " type: " + StaticExample.getType());
		System.out.println("s2 instance: " + s2.getInstancesNum());
		
		StaticExample.setType("Limo");
		
		StaticExample s3 = new StaticExample("VW");
		s3.setInstancesNum(5);
		System.out.println("s2 make: " + s2.getCar() + " type: " + StaticExample.getType());
		System.out.println("s2 instance: " + s2.getInstancesNum());
		System.out.println("Class instance: " + StaticExample.getInstanceClass());
		
		StaticExample s4 = new StaticExample("Audi");
		System.out.println("s2 make: " + s2.getCar() + " type: " + StaticExample.getType());
		System.out.println("s2 instance: " + s2.getInstancesNum());
		System.out.println("Class instance: " + StaticExample.getInstanceClass());
		
	}

}
