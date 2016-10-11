package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

public class LightButton extends JButton{
	private JButton button; 
	
	LightButton(){
		super();
		this.setText(this.nameGenerator());
		this.setPreferredSize(new Dimension(100,100));
	}
	
	private String nameGenerator(){
		int value = (int) (Math.random()*2);
		if(value==0){
			return "O";
		}
		return "X";
	}
	


}
