package inheritancepackage;

public class Car extends Vehicle{

		private static String motionType = "driving";
		private static int carInstance = 0;
		private String color;
		private static String steering = "wheel";
//		public Car(String brand, String motionType, String bodyType, String steering, int speed, String color) {
//			super(brand, motionType, bodyType, steering, speed);
//			this.color = color;
//			carInstance ++;
//		}
		public Car(String brand, String motionType, String bodyType, String steering, int speed, int directionHorizontal,
		int directionVertical, String color) {
			super(brand, motionType, bodyType, steering, speed, directionHorizontal, directionVertical);
			this.color = color;
			carInstance ++;
		}
		

		@Override
		public int accelarate(int amount) {
			// TODO Auto-generated method stub
			return super.accelarate(amount);
		}
		
		public String getMotionType() {
			return motionType;
		}
		public void setMotionType(String motionType) {
			Car.motionType = motionType;
		}
		public static int getCarInstance() {
			return carInstance;
		}
		public static void setCarInstance(int carInstance) {
			Car.carInstance = carInstance;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getSteering() {
			return steering;
		}
		public void setSteering(String steering) {
			Car.steering = steering;
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
