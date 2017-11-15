import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Luis M. Cintron");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setSize(200,200);
		
		myFrame.setJMenuBar(null);
		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth(); // the screen width
		int height = (int) screenSize.getHeight();// the screen height
		myFrame.setLocation((width/2) -100, (height/2) -100);
		
	}
}