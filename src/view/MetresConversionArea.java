package view;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import model.Convertor;

/**
 * The conversion area for metres in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class MetresConversionArea extends AbstractConversionArea implements PropertyChangeListener{

	private static final long serialVersionUID = 130666836428694506L;

	/**
	 * Creates a new MetresConversionArea with an orange background and uneditable text.
	 */
	public MetresConversionArea() {
		super(" m", Color.ORANGE, false);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// observer side convert		
		super.setText(Double.toString(Convertor.convertToM((int) evt.getNewValue())));
		
	}
	
}
