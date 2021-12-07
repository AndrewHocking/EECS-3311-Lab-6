package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * The menu bar at the top of the screen in the ConverterProject application.
 * 
 * @author Andrew Hocking
 */
public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 4871152303151617321L;

	/**
	 * Creates a new MenuBar.
	 * 
	 * @param menubarListener The ActionListener for this MenuBar.
	 */
	public MenuBar(ActionListener menubarListener) {
		super();
		JMenu updateModelMenu = new JMenu("Update model");
		updateModelMenu.add(createMenuItem("Save input centimetres", "Save input centimetres", KeyEvent.VK_F,
				KeyEvent.ALT_DOWN_MASK, menubarListener));
		super.add(updateModelMenu);
	}

	/**
	 * Creates a new menu item for the menu bar.
	 * 
	 * @param text          The menu item's name.
	 * @param actionCommand The name of the item's Action Command.
	 * @param accelerator   The keyboard shortcut for the menu item.
	 * @param modifier      The modifier key to be held down with the accelerator
	 *                      key (set to 0 for no modifier key).
	 * @param listener      The ActionListener to listen for interaction with the
	 *                      menu item.
	 * @return The new menu item.
	 */
	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, int modifier,
			ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, modifier));
		return menuItem;
	}

}
