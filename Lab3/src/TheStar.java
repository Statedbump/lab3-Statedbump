import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class TheStar {
	private int x1;
	private int y1;
	
	public TheStar(int x1,int y1){
		this.x1 = x1;
		this.y1 = y1;
	}
	public void draw(Graphics g){
	 Polygon p2 = new Polygon();
     
     p2.addPoint(x1 + 25, y1 + 73);
     p2.addPoint(x1 + 41, y1 + 73);
     p2.addPoint(x1 + 47, y1 + 58);
     p2.addPoint(x1 + 53, y1 + 73);
     p2.addPoint(x1 + 69, y1 + 73);
     p2.addPoint(x1 + 56, y1 + 83);
     p2.addPoint(x1 + 61, y1 + 98);
     p2.addPoint(x1 + 47, y1 + 88);
     p2.addPoint(x1 + 34, y1 + 98);
     p2.addPoint(x1 + 38, y1 + 83);
     g.setColor(Color.white);
     g.fillPolygon(p2);
    
     }

}
