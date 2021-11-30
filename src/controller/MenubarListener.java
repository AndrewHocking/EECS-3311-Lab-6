package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ConversionPanel;

/**
 * A listener for the ConverterProject application's menu bar.
 * 
 * @author Andrew Hocking
 */
public class MenubarListener implements ActionListener {

	ConversionPanel conversionPanel;

	public MenubarListener(ConversionPanel conversionPanel) {
		this.conversionPanel = conversionPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Save input centimetres":
			// TODO:  retrieves input int in the CentimetersConversionArea JTextArea and sets the new state of ValueToConvert with it
			break;
		default:
			throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
