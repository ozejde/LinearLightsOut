package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * 
 * A JButton that quits the game when pressed
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class QuitButton extends JButton {
	private LightsOutFrame frame;

	/**
	 * 
	 * Creates a new QuitButton
	 *
	 */
	public QuitButton() {
		super();
		this.setText("Quit");
		this.setPreferredSize(new Dimension(70, 30));

		this.addActionListener(new ButtonListener(this, "QuitButton"));
	}

}
