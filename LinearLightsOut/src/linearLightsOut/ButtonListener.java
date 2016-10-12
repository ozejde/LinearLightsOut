package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (this.type.equals("LightButton")) {
			if (button.getText().equals("X")) {
				this.button.setText("O");
			} else {
				this.button.setText("X");
			}
		}
		
		if(this.type.equals("QuitButton")){
			System.exit(0);
		}
		
		if(this.type.equals("NewGameButton")){
			JFrame frame = (JFrame) SwingUtilities.getRoot(this.button);
			int nButtons = ((LightsOutFrame) frame).getNButtons();
			frame.dispose();
			
			LightsOutFrame lightsOutFrame = new LightsOutFrame();
			lightsOutFrame.getButtons(nButtons);
			lightsOutFrame.getFrame();
		}
	}

}
