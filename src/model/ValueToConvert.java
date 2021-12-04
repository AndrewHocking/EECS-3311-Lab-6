package model;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

/**
 * subject(observable) of observer pattern with state cm to be inspected.
 * 
 * @author Yun Lin
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
	 * add observer to observers list
	 * 
	 * @param pcl PropertyChangeListener
	 */
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	//
	/**
	 * remove observer from observers list
	 * 
	 * @param pcl PropertyChangeListener
	 */
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
	 * change the state cm and update to notify observer list.
	 * 
	 * @param acm input cm.
	 * postcondition: this.cm == acm
	 */
	public void setCM(Integer acm) {
		support.firePropertyChange("cm", this.cm, acm);
		cm = acm;
	}
}
