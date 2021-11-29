package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import model.ValueToConvert;

/**
 * A listener for the ConverterProject application's menu bar.
 * 
 * @author Andrew Hocking
 */
public class MenubarListener implements ActionListener {

	JTextArea conversionPanel;

	public MenubarListener(JTextArea conversionPanel) {
		this.conversionPanel = conversionPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ValueToConvert v = new ValueToConvert();
		switch (e.getActionCommand()) {
		case "Save input centimetres":
			// TODO: retrieves input text set to v
			v.setCM(Integer.parseInt(this.conversionPanel.getText()));
			break;
		default:
			throw new RuntimeException("Invalid action command " + e.getActionCommand());
		}
	}
}
