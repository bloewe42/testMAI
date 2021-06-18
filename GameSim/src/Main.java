import java.io.IOException;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("Machine Learning");
		myPanel panel = new myPanel();
		frame.getContentPane().add(panel);
		frame.setBackground(new java.awt.Color(170, 165, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(813, 538);
		frame.setResizable(false);
	}
}
