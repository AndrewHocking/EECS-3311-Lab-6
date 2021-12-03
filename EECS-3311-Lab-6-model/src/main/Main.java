package main;

import javax.swing.*;

import controller.MenubarListener;
import model.ValueToConvert;
import view.ConversionPanel;
import view.MenuBar;

/**
 * A starter class for the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class Main {

	/**
	 * Starts the application.
	 * 
	 * @param args - Command line arguments (unused).
	 */
	public static void main(String[] args) {
		JFrame appFrame = new JFrame("Unit Converter");
		ConversionPanel conversionPanel = new ConversionPanel();
		ValueToConvert v = new ValueToConvert();
		MenubarListener menubarListener = new MenubarListener(conversionPanel, v);
		MenuBar menuBar = new MenuBar(menubarListener);
		appFrame.add(conversionPanel);
		appFrame.setJMenuBar(menuBar);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.setSize(600, 600);
		appFrame.setLocationRelativeTo(null);
		appFrame.setResizable(false);
		appFrame.setVisible(true);
	}
}
