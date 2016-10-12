package linearLightsOut;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class FullPanel extends JPanel{
	ButtonPanel buttonPanel;
	ControlPanel controlPanel;

	public FullPanel() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.buttonPanel = new ButtonPanel();
		this.controlPanel = new ControlPanel();
		this.add(this.buttonPanel);
		this.add(this.controlPanel);

	}
	
	public void getButtons(int nButtons1){
		this.buttonPanel.getButtons(nButtons1);
	}
	
	public void getFrame(LightsOutFrame frame){
		this.buttonPanel.getFrame(frame); 
		this.controlPanel.getFrame(frame);
	};
	
}