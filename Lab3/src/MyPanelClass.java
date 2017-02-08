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
        
       g.setColor(Color.GREEN);
       g.drawRect(x1, y1, width, height);
        
        
       g.setColor(Color.RED);
        // Because width = x2 - x1 we need to subtract the double of the value in with and height
       g.drawRect(x1+20, y1+10, width-40, height-20);
        
       g.setColor(Color.RED);
       g.drawLine(x2,y1,x1,y2);
        
       g.setColor(Color.WHITE);
       g.drawLine(x1, y1, x2, y2);  
        
        g.setColor(Color.blue);
        g.fillOval(getX()+90,getY()+40, 50,50); 
        
      
	}

}
