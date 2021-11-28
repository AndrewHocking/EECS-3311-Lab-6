package view;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import model.Convertor;

/**
 * The conversion area for feet in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class FeetConversionArea extends AbstractConversionArea implements PropertyChangeListener{

	private static final long serialVersionUID = 1332754908163000939L;

	/**
	 * Creates a new FeetConversionArea with a green background and uneditable text.
	 */
	public FeetConversionArea() {
		super(" ft", Color.GREEN, false);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// observer side convert
		super.setText(Double.toString(Convertor.convertToFeet((int) evt.getNewValue())));
	}

}
