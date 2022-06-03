import java.awt.*;
import java.awt.event.*;

import java.awt.Rectangle;

public class Box extends Rectangle{

	Color color;
	
	Box(int x, int y, int width, int height, Color color){
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		
		
		
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			this.y = y-5;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.y = y+5;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.x = x-5;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.x = x+5;
		}
		
		
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
		
		
		
		
		
		
	}
}