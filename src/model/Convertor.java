package model;

public final class Convertor {
	//convert cm to feet.
		public static String convertToFeet(int in) {
			String temp = String.format("%.11f", (0.03280839895 * in));
			return temp;
		}
		//convert cm to m.
		public static String convertToM(int in) {
			String temp = String.format("%.2f", (in * 0.01));
			return temp;
		}
}
