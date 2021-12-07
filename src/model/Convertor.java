package model;

import java.text.DecimalFormat;

/**
 * A utility class for converting measurements to different units.
 * 
 * @author Yun Lin
 * @author Andrew Hocking
 */
public final class Convertor {

	/**
	 * Converts centimetres to feet, assuming 1 cm = 0.03280839895 ft.
	 * 
	 * @param cm Centimetre value to convert.
	 * @return A String representation of the value in feet, with up to a maximum of
	 *         11 decimal places.
	 */
	public static String convertCentimetresToFeet(double cm) {
		return formatOutput(0.03280839895 * cm);
	}

	/**
	 * Converts centimetres to metres, assuming 1 cm = 0.01 m.
	 * 
	 * @param cm Centimetre value to convert.
	 * @return A String representation of the value in metres, with up to a maximum
	 *         of 11 decimal places.
	 */
	public static String convertCentimetresToMetres(double cm) {
		return formatOutput(cm * 0.01);
	}

	/**
	 * Formats the output to a String representation of the output value, with up to
	 * a maximum of 11 decimal places and trailing zeroes removed.
	 * 
	 * @param outputNumber The number to be formatted.
	 * @return Formatted output value
	 */
	private static String formatOutput(double outputNumber) {
		return new DecimalFormat("#.###########").format(outputNumber);
	}

}
