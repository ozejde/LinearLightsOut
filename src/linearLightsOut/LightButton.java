package linearLightsOut;

import javax.swing.JButton;

public class LightButton extends JButton{
	private JButton button; 
	
	LightButton(){
		super();
		this.setText(this.nameGenerator());
	}
	
	private String nameGenerator(){
		int value = (int) (Math.random()*2);
		if(value==0){
			return "O";
		}
		return "X";
	}
	


}
