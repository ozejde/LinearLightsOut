package linearLightsOut;

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

		LightsOutFrame lightsOutFrame = new LightsOutFrame();
		lightsOutFrame.getButtons(nButtons);

	}
}
