package main;
import controller.MenubarListener;
import view.MenuBar;
import view.ConversionPanel;

import javax.swing.*;

/**
 * A starter class for the UnitConversionApp application.
 */
public class UnitConversionApp {

	/**
	 * Starts the application.
	 * @param args - Command line arguments (unused).
	 */
	public static void main(String[] args) {
		JFrame appFrame = new JFrame("Unit Converter");
		ConversionPanel conversionPanel = new ConversionPanel();
		MenubarListener menubarListener = new MenubarListener(conversionPanel);
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
