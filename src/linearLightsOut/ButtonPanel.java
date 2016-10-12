package linearLightsOut;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private LightButton lightButton;
	

	public ButtonPanel() {
		super();
		this.setLayout(new FlowLayout());
	}

	public void getButtons(int nButtons) {

		for (int i = 0; i < nButtons; i++) {
			this.lightButton = new LightButton();
			this.add(this.lightButton);
		}
	}

}
