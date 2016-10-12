package linearLightsOut;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 * 
 * JFrame that contains all game elements
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class LightsOutFrame extends JFrame {
	FullPanel fullPanel;
	int nButtons;

	/**
	 * 
	 * Creates new LightsOutFrame and puts a FullPanel inside of it
	 *
	 */
	public LightsOutFrame() {
		super();
		this.setTitle("Linear Lights Out!");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400);
		this.setMinimumSize(new Dimension(275, 200));
		this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		this.fullPanel = new FullPanel();
		this.add(this.fullPanel);
		this.setVisible(true);
	}

	/**
	 * 
	 * Adjusts frame size based on number of LightButtons and gives number of
	 * LightButtons to FullPanel
	 *
	 * @param nButtons
	 */
	public void getButtons(int nButtons) {
		this.nButtons = nButtons;
		this.fullPanel.getButtons(nButtons);
		this.setSize(70 * nButtons, 200);
		this.setVisible(true);
	}

	/**
	 * 
	 * Gives number of LightButtons in game
	 *
	 * @return
	 */
	public int getNButtons() {
		return this.nButtons;
	}

}
