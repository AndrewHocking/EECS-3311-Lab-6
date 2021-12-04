package view;

import javax.swing.*;

/**
 * The main panel of the ConverterProject application, where the conversion area
 * text boxes live.
 * 
 * @author Andrew Hocking
 */
public class ConversionPanel extends JPanel {

	private static final long serialVersionUID = -3804609030688748276L;
	private FeetConversionArea feetConversionArea;
	private MetresConversionArea metresConversionArea;
	private CentimetresConversionArea centimetresConversionArea;

	/**
	 * Creates a new panel containing three conversion areas: one for feet, one for
	 * metres, and one for centimetres.
	 */
	public ConversionPanel() {
		super();

		feetConversionArea = new FeetConversionArea();
		metresConversionArea = new MetresConversionArea();
		centimetresConversionArea = new CentimetresConversionArea();

		add(feetConversionArea);
		add(metresConversionArea);
		add(centimetresConversionArea);
	}

	/**
	 * Retrieves the FeetConversionArea from this ConversionPanel.
	 * 
	 * @return The FeetConversionArea from this ConversionPanel.
	 */
	public FeetConversionArea getFeetConversionArea() {
		return feetConversionArea;
	}

	/**
	 * Retrieves the MetresConversionArea from this ConversionPanel.
	 * 
	 * @return The MetresConversionArea from this ConversionPanel.
	 */
	public MetresConversionArea getMetresConversionArea() {
		return metresConversionArea;
	}

	/**
	 * Retrieves the CentimetresConversionArea from this ConversionPanel.
	 * 
	 * @return The CentimetresConversionArea from this ConversionPanel.
	 */
	public CentimetresConversionArea getCentimetresConversionArea() {
		return centimetresConversionArea;
	}

}
