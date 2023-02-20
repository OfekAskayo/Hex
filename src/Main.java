/* Copyright 2012 David Pearson.
 * BSD License
 */

import javax.swing.JFrame;
import java.awt.*;

/**
 * Runs the application.
 *
 * @author David Pearson
 */
public class Main {
	/**
	 * Main method. Creates a window.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hex");
		frame.setSize(400, 500);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel());
		frame.setVisible(true);
	}
}