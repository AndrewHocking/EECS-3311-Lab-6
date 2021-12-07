package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import model.Convertor;
import model.ValueToConvert;
import view.ConversionPanel;

/**
 * A listener for the ConverterProject application's menu bar. Controller class
 * and observer of observer pattern to wiring a update method to
 * subject(ValueToConvert).
 * 
 * @author Andrew Hocking
 * @author Yun Lin
 */
public class MenubarListener implements ActionListener {

	ConversionPanel conversionPanel;
	ValueToConvert model;

	/**
	 * Creates a MenubarListener for the given ConversionPanel, which acts as the
	 * app's controller. Connects the model, view, and controller, and creates the
	 * update method following the Observer design pattern.
	 * 
	 * @param conversionPanel view
	 * @param model           model
	 */
	public MenubarListener(final ConversionPanel conversionPanel, final ValueToConvert model) {
		this.conversionPanel = conversionPanel;
		this.model = model;
		model.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equalsIgnoreCase("cm")) {
					String metres = Convertor.convertCentimetresToMetres((double) evt.getNewValue());
					conversionPanel.getMetresConversionArea().setText(metres);
					String feet = Convertor.convertCentimetresToFeet((double) evt.getNewValue());
					conversionPanel.getFeetConversionArea().setText(feet);
				}
			}

		});
	}

	/**
	 * Common in Commander pattern: Retrieves input value in the
	 * CentimetersConversionArea JTextArea and sets the new state of ValueToConvert
	 * with it.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "Save input centimetres":
			String cmText = this.conversionPanel.getCentimetresConversionArea().getText();
			if (cmText.equals("") || cmText.equals("-")) {
				cmText = "0";
				conversionPanel.getCentimetresConversionArea().setText("0");
			}
			model.setCM(Double.parseDouble(cmText));
			break;
		default:
			throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
