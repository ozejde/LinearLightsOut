package linearLightsOut;

import java.awt.FlowLayout;

import javax.swing.JPanel;

/**
 * 
 * A JPanel in current JFrame that contains a QuitButton and NewGameButton
 * 
 * @author ejdeoz. Created Oct 10, 2016.
 */
public class ControlPanel extends JPanel {
	private NewGameButton newGameButton;
	private QuitButton quitButton;

	/**
	 * 
	 * Creates a ControlPanel object and adds a QuitButton and NewGameButton
	 *
	 */
	public ControlPanel() {
		super();
		this.setLayout(new FlowLayout());
		this.newGameButton = new NewGameButton();
		this.quitButton = new QuitButton();
		this.add(this.newGameButton);
		this.add(this.quitButton);
	}

}
