import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {   
	private static final long serialVersionUID = 1L; //bentigt man fr deklaration von Label
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Variablen.ib1, 0, Variablen.hintergrundY1, 800, 600, null);   //y(=dritte Stelle) soll ich verndern lassen, weil sich hintergrund bewegt
		g.drawImage(Variablen.ib2, 0, Variablen.hintergrundY2, 800, 600, null);
		
		
		g.drawImage(Variablen.iAuto, Variablen.xAuto, Variablen.yAuto, 60, 80, null);
		//g.drawImage(Variablen.Player, Variablen.xAuto, Variablen.yAuto, 50, 50, null);
		g.drawImage(Variablen.iAuto, Variablen.xGegner1, Variablen.yGegner1, 60, 80, null);
		g.drawImage(Variablen.iAuto, Variablen.xGegner2, Variablen.yGegner2, 60, 80, null);
		g.drawImage(Variablen.iAuto, Variablen.xGegner3, Variablen.yGegner3, 60, 80, null);
		
		g.setColor(Color.red);
		g.setFont(new Font("MV Boli", Font.PLAIN, 20));
		g.drawString("Score: " + Variablen.Score/4, 650, 50); // /4 kann durch belibige Zahl ersetzt werden, war nur damit er nicht zu schnell steigt
		
		
		if(Variablen.Player.intersects(Variablen.Enemy1) || Variablen.Player.intersects(Variablen.Enemy2) || Variablen.Player.intersects(Variablen.Enemy3)) {
			Variablen.gameover = true;
			//System.out.println("Game Over Loser");
			Variablen.endee = new Timestamp(System.currentTimeMillis());
			long startConvert = Variablen.startt.getTime();
			long endeConvert = Variablen.endee.getTime();
			long elapsedTime = endeConvert - startConvert;
			System.out.println(elapsedTime/1000 +  " sekunden");
		}
		
		repaint();
		
		if(Variablen.gameover == true) {
			g.setColor(Color.red);
			g.setFont(new Font("MV Boli", Font.PLAIN, 45));
			g.drawString("Game Over Loser", 200, 100);
			g.setFont(new Font("MV Boli", Font.PLAIN, 30));
			g.drawString("Your Score: " + Variablen.Score/4, 300, 150);
			
			
		}
		

	}
	
		
	}
