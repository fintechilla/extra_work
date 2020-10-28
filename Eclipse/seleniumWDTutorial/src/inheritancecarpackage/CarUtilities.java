package inheritancecarpackage;

public class CarUtilities {

	public static int getDirection360(int value) {
//		System.out.println("value: " + value +"abs: " + (float)Math.abs(value)/360);
		if (value < 0) {
			value = (int) (value + (360 * Math.ceil((float) Math.abs(value) / 360)));
		}
		return value % 360;
	}

}
