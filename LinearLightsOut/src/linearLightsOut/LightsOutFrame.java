package linearLightsOut;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class LightsOutFrame extends JFrame {
	FullPanel fullPanel;

	public LightsOutFrame() {
		super();
		this.setTitle("Linear Lights Out!");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400);
		this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		this.fullPanel = new FullPanel();
		this.add(this.fullPanel);
		this.setVisible(true);
	}

	public void getButtons(int nButtons) {
		this.fullPanel.getButtons(nButtons);
		this.setSize(70*nButtons, 200);
		this.setVisible(true);
	}
}
