package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * 
 * A JButton that changes text when pressed
 *
 * @author ejdeoz. Created Oct 12, 2016.
 */
public class LightButton extends JButton {

	/**
	 * 
	 * Creates a new LightButton
	 *
	 */
	LightButton() {
		super();
		this.setText(this.nameGenerator());
		this.setPreferredSize(new Dimension(50, 30));

		this.addActionListener(new ButtonListener(this, "LightButton"));
	}

	/**
	 * 
	 * Randomly generates text for a new LightButton
	 *
	 * @return String X or O
	 */
	private String nameGenerator() {
		int value = (int) (Math.random() * 2);
		if (value == 0) {
			return "O";
		}
		return "X";
	}

}
