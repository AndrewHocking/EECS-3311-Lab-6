package view;

import java.awt.Color;

import javax.swing.text.AbstractDocument;

import model.NumberFilter;

/**
 * The conversion area for centimetres in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class CentimetresConversionArea extends AbstractConversionArea {

	private static final long serialVersionUID = 9216120237211885669L;

	/**
	 * Creates a new CentimetresConversionArea with a yellow background and editable
	 * text.
	 */
	public CentimetresConversionArea() {
		super("", Color.YELLOW, true);
		((AbstractDocument) getDocument()).setDocumentFilter(new NumberFilter());
	}

}
