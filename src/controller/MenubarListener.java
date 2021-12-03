package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


import model.Convertor;
import model.ValueToConvert;
import view.ConversionPanel;

/**
 * A listener for the ConverterProject application's menu bar.
 * 
 * @author Andrew Hocking
 */
/**
 * @author Yun Lin
 *
 */
public class MenubarListener implements ActionListener{

	ConversionPanel conversionPanel;
	ValueToConvert model;
	//
	/**
	 * @param conversionPanel view
	 * @param model model
	 */
	public MenubarListener(final ConversionPanel conversionPanel, final ValueToConvert model) {
		this.conversionPanel = conversionPanel;
		this.model = model;
		model.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				if (evt.getPropertyName().equalsIgnoreCase("cm")) {
					String d1 = Convertor.convertToM((int) evt.getNewValue());
					conversionPanel.getMetresConversionArea().setText(d1);
					conversionPanel.getFeetConversionArea().setText(Convertor.convertToFeet((int) evt.getNewValue()));
				}
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "Save input centimetres":
			// TODO:  retrieves input int in the CentimetersConversionArea JTextArea and sets the new state of ValueToConvert with it
			
			model.setCM(Integer.parseInt(this.conversionPanel.getCentimetresConversionArea().getText()));
			break;
		default:
			throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
