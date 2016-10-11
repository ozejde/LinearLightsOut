package linearLightsOut;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author Olivia Ejde. Created Oct 10, 2016.
 */
public class LinearMain {

	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nButtonsString = JOptionPane.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		
		JFrame myFrame = new JFrame("Linear Lights Out!");
		BoxLayout boxLayout = new BoxLayout(myFrame.getContentPane(), BoxLayout.X_AXIS);
		myFrame.setLayout(boxLayout);
		
		for (int i = 0; i < nButtons; i++) {
			
			myFrame.add(new LightButton());
		}
		// you'll want to think about how you want to manage the state of the
		// game
		// also you want to add some buttons and stuff
		myFrame.setVisible(true);
	}
}
