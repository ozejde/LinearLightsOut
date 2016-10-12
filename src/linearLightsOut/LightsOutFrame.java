package linearLightsOut;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class LightsOutFrame extends JFrame {
	FullPanel fullPanel;
	int nButtons;

	public LightsOutFrame() {
		super();
		this.setTitle("Linear Lights Out!");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400);
		this.setMinimumSize(new Dimension(275,200));
		this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		this.fullPanel = new FullPanel();
		this.add(this.fullPanel);
		this.setVisible(true);
	}

	public void getButtons(int nButtons) {
		this.nButtons = nButtons;
		this.fullPanel.getButtons(nButtons);
		this.setSize(70*nButtons, 200);
		this.setVisible(true);
	}
	
	public int getNButtons(){
		return this.nButtons;
	}
	
	public void getFrame(){
		this.fullPanel.getFrame(this);
	}
}