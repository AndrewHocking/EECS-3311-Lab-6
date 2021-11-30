package view;

import java.awt.Color;

/**
 * The conversion area for metres in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class MetresConversionArea extends AbstractConversionArea {

	private static final long serialVersionUID = 130666836428694506L;

	/**
	 * Creates a new MetresConversionArea with an orange background and uneditable text.
	 */
	public MetresConversionArea() {
		super(" m", Color.ORANGE, false);
	}
	
}
