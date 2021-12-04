package model;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

/**
 * A value class representing the centimetre value to be converted in the
 * ConverterProject application.
 * 
 * @author Yun Lin
 */
public class ValueToConvert {
	// the state of input
	private Double cm;

	private PropertyChangeSupport support;

	public ValueToConvert() {
		support = new PropertyChangeSupport(this);
	}

	/**
	 * Adds a PropertyChangeListener to this model.
	 * 
	 * @param pcl - The PropertyChangeListener to be added to this model.
	 */
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	/**
	 * Removes a PropertyChangeListener from this model.
	 * 
	 * @param pcl - The PropertyChangeListener to be added to this model.
	 */
	public void removedPropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	/**
	 * Retrieves the state of the cm property.
	 * 
	 * @return The state of cm property.
	 */
	public double getCM() {
		return cm;
	}

	/**
	 * Sets the cm property to the specified value.
	 * 
	 * @param acm input cm.
	 * @postcondition this.cm == acm
	 */
	public void setCM(Double acm) {
		support.firePropertyChange("cm", this.cm, acm);
		cm = acm;
	}
}
