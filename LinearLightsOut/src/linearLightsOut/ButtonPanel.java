package linearLightsOut;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private LightButton lightButton;
	

	public ButtonPanel() {
		super();
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
	}

	public void getButtons(int nButtons) {

		for (int i = 0; i < nButtons; i++) {
			this.lightButton = new LightButton();
			this.add(this.lightButton);
		}
	}

}
