package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ButtonListener implements ActionListener {
	private JButton button;
	private String type;
	private LightsOutFrame frame;
	private NewGameButton newGameButton;

	public ButtonListener(JButton button, String type) {
		this.button = button;
		this.type = type;
	}

	public void setButtonText(JButton button) {
		if (button.getText().equals("X")) {
			button.setText("O");
		} else {
			button.setText("X");
		}
	}
	
	public boolean checkIfWinner(ArrayList<LightButton> buttons){
		String firstLetter = buttons.get(0).getText();
		for(int i=1;i<buttons.size();i++){
			if(!buttons.get(i).getText().equals(firstLetter)){
				return false;
			}
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

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
			
			if(checkIfWinner(buttons)){
				JFrame frame = (JFrame) SwingUtilities.getRoot(this.button);
				frame.setTitle("You win!");
			}

		}

		if (this.type.equals("QuitButton")) {
			System.exit(0);
		}

		if (this.type.equals("NewGameButton")) {

			JFrame frame = (JFrame) SwingUtilities.getRoot(this.button);

			int nButtons = ((LightsOutFrame) frame).getNButtons();
			frame.dispose();

			LightsOutFrame lightsOutFrame = new LightsOutFrame();
			lightsOutFrame.getButtons(nButtons);
			lightsOutFrame.getFrame();
		}
	}

}
