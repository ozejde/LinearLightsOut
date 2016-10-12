package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * 
 * Handles the actions of all buttons that are clicked
 *
 * @author ejdeoz. Created Oct 10, 2016.
 */

public class ButtonListener implements ActionListener {
	private JButton button;
	private String type;

	/**
	 * 
	 * Constructs a ButtonListener object
	 *
	 * @param button
	 *            button that is clicked
	 * @param type
	 *            String name of button class
	 */
	public ButtonListener(JButton button, String type) {
		this.button = button;
		this.type = type;
	}

	/**
	 * 
	 * Changes the text of the given LightButton
	 *
	 * @param button
	 *            LightButton that needs to change text
	 */
	public void setButtonText(JButton button) {
		if (button.getText().equals("X")) {
			button.setText("O");
		} else {
			button.setText("X");
		}
	}

	/**
	 * 
	 * Checks if all of the LightButtons have the same text
	 *
	 * @param buttons
	 *            ArrayList of buttons in the game
	 * @return boolean of if buttons have the same text
	 */
	public boolean checkIfWinner(ArrayList<LightButton> buttons) {
		String firstLetter = buttons.get(0).getText();
		for (int i = 1; i < buttons.size(); i++) {
			if (!buttons.get(i).getText().equals(firstLetter)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		/**
		 * Changes text if LightButton is clicked and checks if player has won
		 */
		if (this.type.equals("LightButton")) {
			ButtonPanel panel = (ButtonPanel) this.button.getParent();
			ArrayList<LightButton> buttons = panel.getLights();
			int index = buttons.indexOf(this.button);

			this.setButtonText(this.button);

			if (index == 0) {
				this.setButtonText(buttons.get(1));
			} else if (index == buttons.size() - 1) {
				this.setButtonText(buttons.get(index - 1));
			} else {
				this.setButtonText(buttons.get(index - 1));
				this.setButtonText(buttons.get(index + 1));
			}

			if (checkIfWinner(buttons)) {
				JFrame frame = (JFrame) SwingUtilities.getRoot(this.button);
				frame.setTitle("You win!");
			}

		}

		/**
		 * Exits game if QuitButton is clicked
		 */
		if (this.type.equals("QuitButton")) {
			System.exit(0);
		}

		/**
		 * Restarts the game if NewGameButton is clicked
		 */
		if (this.type.equals("NewGameButton")) {

			JFrame frame = (JFrame) SwingUtilities.getRoot(this.button);

			int nButtons = ((LightsOutFrame) frame).getNButtons();
			frame.dispose();

			LightsOutFrame lightsOutFrame = new LightsOutFrame();
			lightsOutFrame.getButtons(nButtons);
		}
	}

}
