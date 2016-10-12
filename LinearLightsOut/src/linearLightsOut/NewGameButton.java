package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

public class NewGameButton extends JButton{

	public NewGameButton() {
		super();
		this.setText("New Game");
		this.setPreferredSize(new Dimension(100,30));
	}
}
