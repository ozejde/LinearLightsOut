package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * 
 * A JButton that restarts the game when pressed
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class NewGameButton extends JButton {
	/**
	 * 
	 * Creates a new NewGameButton
	 *
	 */
	public NewGameButton() {
		super();
		this.setText("New Game");
		this.setPreferredSize(new Dimension(100, 30));
		this.addActionListener(new ButtonListener(this, "NewGameButton"));
	}

}
