package inheritancepackage;

public class CarApp {

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "drives", "pasenger","wheel",100, 0, 0, "red");
		System.out.println("This is " + c1.getBrand() + " is " + c1.getColor() + " and is my " + Car.getCarInstance() + "th car");
		System.out.println("Current speed: " + c1.getSpeed() + " Current direction H: " + c1.getDirectionHorizontal());
		c1.accelarate(20);
		c1.turnH(-30);
		c1.accelarate(-40);
		c1.turnH(500);
		c1.turnH(750);
		c1.turnH(-420);
		System.out.println("Current speed: " + c1.getSpeed() + " Current direction H: " + c1.getDirectionHorizontal());

	}

}
