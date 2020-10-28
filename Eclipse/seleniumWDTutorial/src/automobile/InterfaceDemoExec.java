package automobile;

public class InterfaceDemoExec {

	public static void main(String[] args) {
		
//		CarsInterface myInterface = new InterfaceDemo(); // used only when InterfaceDemo inherits 
		InterfaceDemo myInterface = new InterfaceDemo();
		myInterface.engineStart("6 CYL", true);
		
		myInterface.headsUpNavigation();
		System.out.println("Speed: " + myInterface.speed); 
	}

}
