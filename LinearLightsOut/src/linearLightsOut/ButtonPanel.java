package linearLightsOut;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	private LightsOutFrame frame;
	private LightButton lightButton;
	private ArrayList<LightButton> buttons;
	

	public ButtonPanel() {
		super();
		this.setLayout(new FlowLayout());
		this.buttons = new ArrayList<>();
	}

	
	public void getButtons(int nButtons) {
		
		for (int i = 0; i < nButtons; i++) {
			this.lightButton = new LightButton();
			this.buttons.add(this.lightButton);
			this.add(this.lightButton);
			
		}
	}
	
	public  ArrayList<LightButton> getLights(){
		return this.buttons;
	}
	
	public void getFrame(LightsOutFrame frame){
		this.frame = frame;
	}

	
}
