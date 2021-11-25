package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ConversionPanel;

/**
 * A listener for the UnitConversionApp's menu bar.
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
				// TODO: Implement class with method to convert cm to m and ft.
				break;
			default:
				throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
