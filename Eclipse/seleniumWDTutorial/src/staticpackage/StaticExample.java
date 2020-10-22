package staticpackage;

public class StaticExample {
	private static int instancesNum = 0;
	private static String type = "Passenger";
	private String car;
	public StaticExample(String car) {
		super();
		this.car = car;
		instancesNum ++;
	}
	public int getInstancesNum() {
		return instancesNum;
	}
	public void setInstancesNum(int instancesNum) {
		this.instancesNum = instancesNum;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		StaticExample.type = type;
	}
	
	public static int  getInstanceClass() {
		return instancesNum;
		
	}
	
	
	
	
	
	
	

}
