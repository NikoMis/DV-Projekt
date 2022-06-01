
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame{

	Image image;
	Graphics graphics;
	Box Player;
	Box Enemy;
	Box Feld;
	
	boolean gameover;
	

	
	MyFrame(){
		Player = new Box(100, 300, 50, 50, Color.blue);
		Enemy = new Box(400, 300, 50, 50, Color.red);
		Feld = new Box (0, 0, 1000, 1000, Color.lightGray);
		gameover = false;
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true); 
		this.addKeyListener(new AL());
		
	}
	
	public void paint(Graphics g) {
		
		image = createImage(this.getWidth(), this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image, 0, 0, this);
		
		Feld.draw(g);
		Player.draw(g);
		Enemy.draw(g);
		
		if(gameover == true) {
			g.setColor(Color.red);
			g.setFont(new Font("MV Boli", Font.PLAIN, 45));
			g.drawString("Game Over Loser", 150, 100);
		}
		
	}
	
	public void checkCollision() {
		if(Player.intersects(Enemy)) {
			gameover = true;
			System.out.println("Game Over Loser");
		}
	}
	
	public class AL extends KeyAdapter{
		
		@Override 
		public void keyPressed(KeyEvent e) {
			
			Player.keyPressed(e);
			checkCollision();
			repaint();
		}
	}
	
	
	
}
