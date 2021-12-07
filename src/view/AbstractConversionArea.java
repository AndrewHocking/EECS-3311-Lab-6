package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;

import model.NumberFilter;

/**
 * An abstract class that defines the necessary methods for all ConversionArea
 * objects in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public abstract class AbstractConversionArea extends JTextArea {

	private static final long serialVersionUID = -8796789017865342136L;
	private String unitSuffix;

	/**
	 * Creates a new AbstractConversionArea with the given parameters and sets the
	 * size and margin.
	 * 
	 * @param unitSuffix       The suffix to follow the unit (e.g. For "5 cm" the
	 *                         suffix will be " cm").
	 * @param backgroundColour The background colour of the conversion area.
	 * @param isEditable       Whether the conversion area should be editable by the
	 *                         user or not.
	 */
	public AbstractConversionArea(String unitSuffix, Color backgroundColour, boolean isEditable) {
		this.unitSuffix = unitSuffix;
		setBackground(backgroundColour);
		setEditable(isEditable);
		setPreferredSize(new Dimension(250, 250));
		setMargin(new Insets(10, 10, 10, 10));
		this.setText(null);
		((AbstractDocument) getDocument()).setDocumentFilter(new NumberFilter());
	}

	/**
	 * Retrieves the unit suffix of the AbstractConversionArea.
	 * 
	 * @return The unit suffix of the AbstractConversionArea.
	 */
	public String getUnitSuffix() {
		return this.unitSuffix;
	}

	/**
	 * Sets the text of the AbstractConversionArea to the specified text, and adds
	 * the unit suffix to the end. If the specified text is null or empty, it will
	 * be changed to "0" before the unit suffix is added.
	 */
	@Override
	public void setText(String text) {
		if (text == null || text.equals("")) {
			text = "0";
		}
		super.setText(text + unitSuffix);
	}

}
