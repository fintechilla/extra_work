package automobile;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface{

	@Override
	public void engineStart(String engineType, boolean isKeyless) {
		System.out.println("This is the implementation of InterfaceDemo which implemented CarsInteface");
		
		
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
		
	}
	

	

}
