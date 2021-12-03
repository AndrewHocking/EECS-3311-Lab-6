package model;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class ValueToConvert {
	// the state of input
	private Integer cm;
	
	private PropertyChangeSupport support;
	
	public ValueToConvert() {
		support = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
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
	public void setCM(Integer acm) {
		support.firePropertyChange("cm", this.cm, acm);
		cm = acm;
	}
}
