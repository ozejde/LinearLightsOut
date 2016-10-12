package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

public class QuitButton extends JButton{
	private LightsOutFrame frame;

	public QuitButton() {
		super();
		this.setText("Quit");
		this.setPreferredSize(new Dimension(70,30));
		
		this.addActionListener(new ButtonListener(this, "QuitButton"));
	}
	

}

