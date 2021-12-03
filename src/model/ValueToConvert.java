package model;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

/**
 * @author Yun Lin
 *
 */
public class ValueToConvert {
	// the state of input
	private Integer cm;
	
	private PropertyChangeSupport support;
	
	public ValueToConvert() {
		support = new PropertyChangeSupport(this);
	}
	//
	/**
	 * @param pcl PropertyChangeListener
	 */
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removedPropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
	// getter of cm.
	/**
	 * @return The state of cm property.
	 */
	public int getcm() {
		return cm;
	}
	//setter of cm. 
	
	/**
	 * @param acm input cm.
	 * postcondition: this.cm == acm
	 */
	public void setCM(Integer acm) {
		support.firePropertyChange("cm", this.cm, acm);
		cm = acm;
	}
}
