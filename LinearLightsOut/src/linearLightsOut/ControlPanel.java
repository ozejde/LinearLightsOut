package linearLightsOut;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	private NewGameButton newGameButton;
	private QuitButton quitButton;
	
	public ControlPanel() {
		super();
		this.setLayout(new FlowLayout());
		this.newGameButton = new NewGameButton();
		this.quitButton = new QuitButton();
		this.add(this.newGameButton);
		this.add(this.quitButton);
	}
	
	public void getFrame(LightsOutFrame frame){
		this.newGameButton.getFrame(frame); 
	}

}
