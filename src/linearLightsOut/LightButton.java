package linearLightsOut;

import java.awt.Dimension;

import javax.swing.JButton;

public class LightButton extends JButton{
	
	LightButton(){
		super();
		this.setText(this.nameGenerator());
		this.setPreferredSize(new Dimension(50,30));
		
		this.addActionListener(new ButtonListener(this, "LightButton"));
	}
	
	private String nameGenerator(){
		int value = (int) (Math.random()*2);
		if(value==0){
			return "O";
		}
		return "X";
	}


}
