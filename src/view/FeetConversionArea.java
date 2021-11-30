package view;

import java.awt.Color;

/**
 * The conversion area for feet in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class FeetConversionArea extends AbstractConversionArea {

	private static final long serialVersionUID = 1332754908163000939L;

	/**
	 * Creates a new FeetConversionArea with a green background and uneditable text.
	 */
	public FeetConversionArea() {
		super(" ft", Color.GREEN, false);
	}

}
