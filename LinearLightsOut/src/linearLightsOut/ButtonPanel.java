package linearLightsOut;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * 
 * A JPanel in current JFrame that contains LightButtons
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class ButtonPanel extends JPanel {
	private LightButton lightButton;
	private ArrayList<LightButton> buttons;

	/**
	 * 
	 * Constructs a ButtonPanel object
	 *
	 */
	public ButtonPanel() {
		super();
		this.setLayout(new FlowLayout());
		this.buttons = new ArrayList<>();
	}

	/**
	 * 
	 * Adds buttons to ButtonPanel.
	 *
	 * @param nButtons
	 *            Number of buttons to add to ButtonPanel
	 */
	public void getButtons(int nButtons) {

		for (int i = 0; i < nButtons; i++) {
			this.lightButton = new LightButton();
			this.buttons.add(this.lightButton);
			this.add(this.lightButton);

		}
	}

	/**
	 * 
	 * Returns the ArrayList of buttons in ButtonPanel
	 *
	 * @return the ArrayList of buttons in ButtonPanel
	 */
	public ArrayList<LightButton> getLights() {
		return this.buttons;
	}

}
