import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		//To Compute interior coordinates
		Insets myInsets = this.getInsets();

		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;


		//Background

		g.setColor(Color.GRAY);
		g.fillRect(x1, y1, width, height);

		//BORDER
		



		g.setColor(Color.white);
		g.fillRect(x1, y1, width, height);

		g.setColor(Color.red);
		g.fillRect(x1, y1, width, height/5);
		g.setColor(Color.red);
		g.fillRect(x1, y1+50, width, height-100);
		
		g.setColor(Color.red);
		g.fillRect(x1, y1+100, width, height-100);

		  

		//       g.setColor(Color.blue);
		//       g.fillOval((width/2)-28,(height/2)-28,55,55); 


		       Polygon p1 = new Polygon();
		       p1.addPoint(x1, y1 );
		       p1.addPoint(width/2, height/2);
		       p1.addPoint(x1, y2);
		       g.setColor(Color.BLUE);
		       g.fillPolygon(p1);
		       
		       TheStar s = new TheStar(x1,y1-10);
		   		s.draw(g);
		     
		       
		   	 g.setColor(Color.WHITE);
		     g.drawLine(x1+10, y1, x2, y1);

	}

}
