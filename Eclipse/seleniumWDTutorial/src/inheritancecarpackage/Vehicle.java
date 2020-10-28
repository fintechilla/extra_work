package inheritancecarpackage;

public class Vehicle {
	private String brand;//VW, BMW, Dodge, Beneteau
	private String motionType;//drives, floats, sails, flights, underwater
	private String bodyType;//passenger, limo, truck, military
	private String steering;//joystick, wheel
	private int speed = 0;
	
	private int directionHorizontal;
	private int directionVertical;
	
	public Vehicle(String brand, String motionType, String bodyType, String steering, int speed, 
			int directionHorizontal, int directionVertical) {
		super();
		this.brand = brand; 
		this.motionType = motionType; 
		this.bodyType = bodyType; 
		this.steering = steering; 
		this.speed = speed; 
		this.directionHorizontal = directionHorizontal;
		this.directionVertical = directionVertical;
	}


	public int accelarate(int amount) {
		this.speed = this.speed + amount;
		if(amount > 0) {
			System.out.println("Accelerated by " + amount + " to " + speed);
		}else if (amount < 0 ) {
			System.out.println("Deccelerated by " + amount + " to " + speed);
		}else {
			System.out.println("No changed to speed: " + speed);
		}
		return speed;
	}
	public int turnH(int amount) {
		this.directionHorizontal = CarUtilities.getDirection360(this.directionHorizontal + amount);
		if(amount > 0) {
			System.out.println("Turned right by " + amount  + " to " + this.directionHorizontal);
		}else if (amount < 0 ) {
			System.out.println("Turned left by " + amount  + " to " + this.directionHorizontal );
		}else {
			System.out.println("No change in direction, current is: " + this.directionHorizontal);
		}
		return this.directionHorizontal;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getMotionType() {
		return motionType;
	}


	public void setMotionType(String motionType) {
		this.motionType = motionType;
	}


	public String getBodyType() {
		return bodyType;
	}


	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}


	public String getSteering() {
		return steering;
	}


	public void setSteering(String steering) {
		this.steering = steering;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getDirectionHorizontal() {
		return directionHorizontal;
	}


	public void setDirectionHorizontal(int directionHorizontal) {
		this.directionHorizontal = directionHorizontal;
	}


	public int getDirectionVertical() {
		return directionVertical;
	}


	public void setDirectionVertical(int directionVertical) {
		this.directionVertical = directionVertical;
	}
	
	
	
}
