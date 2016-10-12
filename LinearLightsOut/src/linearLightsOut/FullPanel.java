package linearLightsOut;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * 
 * A JPanel in the current JFrame that contains all elements of the game
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class FullPanel extends JPanel {
	ButtonPanel buttonPanel;
	ControlPanel controlPanel;

	/**
	 * 
	 * Creates a FullPanel object that contains a ButtonPanel and a ControlPanel
	 *
	 */
	public FullPanel() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.buttonPanel = new ButtonPanel();
		this.controlPanel = new ControlPanel();
		this.add(this.buttonPanel);
		this.add(this.controlPanel);

	}

	/**
	 * 
	 * Gives ButtonPanel the number of desired LightButtons
	 *
	 * @param nButtons1
	 *            number of desired LightButtons
	 */
	public void getButtons(int nButtons1) {
		this.buttonPanel.getButtons(nButtons1);
	}

}
