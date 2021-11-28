package model;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

class ValueToConvert {
	// the state of input
	private int cm;
	
	private PropertyChangeSupport support;
	
	public ValueToConvert() {
		support = new PropertyChangeSupport(this);
	}
	
	public void addPorpertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removedPropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
	// getter of cm.
	public int getcm() {
		return cm;
	}
	//setter of cm. 
	public void setCM(int acm) {
		support.firePropertyChange("cm", this.cm, acm);
		cm = acm;
	}
	//convert cm to feet.
	public double convertToFeet() {
		return 0.0328 * cm;
	}
	//convert cm to m.
	public double convertToM() {
		return 0.01 * cm;
	}
}
