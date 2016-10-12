package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

public class NewGameButton extends JButton{
	private LightsOutFrame frame;

	public NewGameButton() {
		super();
		this.setText("New Game");
		this.setPreferredSize(new Dimension(100,30));
		this.addActionListener(new ButtonListener(this, "NewGameButton"));
	}
	
	public void getFrame(LightsOutFrame frame){
		this.frame = frame;
	}
	
}
