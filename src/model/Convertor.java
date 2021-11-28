package model;

public final class Convertor {
	//convert cm to feet.
		public static double convertToFeet(int in) {
			return 0.0328 * in;
		}
		//convert cm to m.
		public static double convertToM(int in) {
			return 0.01 * in;
		}
}
