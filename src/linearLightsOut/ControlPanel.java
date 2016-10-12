package linearLightsOut;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	
	public ControlPanel() {
		super();
		this.setLayout(new FlowLayout());
		this.add(new NewGameButton());
		this.add(new QuitButton());
	}

}
