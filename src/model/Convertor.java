package model;

/**
 * @author Yun Lin
 *
 */
public final class Convertor {
	//convert cm to feet.
		
		/**
		 * @param in	- input integer
		 * @return out String formated feet to 11 dights after decimal point value to be 0.03280839895 * in.
		 */
		public static String convertToFeet(int in) {
			String temp = String.format("%.11f", (0.03280839895 * in));
			return temp;
		}
		//convert cm to m.
		
		/**
		 * @param in	- input integer
		 * @return	output String formated meter to after 2 decimal digits value be in * 0.01.
		 */
		public static String convertToM(int in) {
			String temp = String.format("%.2f", (in * 0.01));
			return temp;
		}
}