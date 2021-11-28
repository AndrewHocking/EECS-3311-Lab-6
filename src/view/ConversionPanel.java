package view;

import java.beans.PropertyChangeListener;

import javax.swing.*;

import controller.MenubarListener;
import model.ValueToConvert;

/**
 * The main panel of the ConverterProject application, where the conversion area text boxes live.
 * 
 * @author Andrew Hocking
 */
public class ConversionPanel extends JPanel {
	
	private static final long serialVersionUID = -3804609030688748276L;
	private FeetConversionArea feetConversionArea;
	private MetresConversionArea metresConversionArea;
	private CentimetresConversionArea centimetresConversionArea;
	ValueToConvert observable = new ValueToConvert();
	
	/**
	 * Creates a new panel containing three conversion areas: one for feet, one for metres, and one for centimetres.
	 */
	public ConversionPanel(MenuBar mb) {
		super();
		
		feetConversionArea = new FeetConversionArea();
		metresConversionArea = new MetresConversionArea();
		centimetresConversionArea = new CentimetresConversionArea();
		MenubarListener menubarListener = new MenubarListener(centimetresConversionArea);
		mb.addActionListener(menubarListener);
		add(feetConversionArea);
		add(metresConversionArea);
		add(centimetresConversionArea);
		// wiring subject to observer
		this.wiringSubtoOb(metresConversionArea);
		this.wiringSubtoOb(feetConversionArea);
	}
	
	/**
	 * Retrieves the FeetConversionArea from this ConversionPanel.
	 * @return The FeetConversionArea from this ConversionPanel.
	 */
	public FeetConversionArea getFeetConversionArea() {
		return feetConversionArea;
	}
	
	/**
	 * Retrieves the MetresConversionArea from this ConversionPanel.
	 * @return The MetresConversionArea from this ConversionPanel.
	 */
	public MetresConversionArea getMetresConversionArea() {
		return metresConversionArea;
	}
	
	/**
	 * Retrieves the CentimetresConversionArea from this ConversionPanel.
	 * @return The CentimetresConversionArea from this ConversionPanel.
	 */
	public CentimetresConversionArea getCentimetresConversionArea() {
		return centimetresConversionArea;
	}

	/*
	 * wiring subject to observer
	 * 
	 * @param l - observer object
	 */
	public void wiringSubtoOb(PropertyChangeListener l) {
		observable.addPorpertyChangeListener(l);
	}
}
