package highspeedracer2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {   
	private static final long serialVersionUID = 1L; //benötigt man für deklaration von Label
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Variablen.ib1, 0, Variablen.hintergrundY1, 800, 600, null);   //y(=dritte Stelle) soll ich verändern lassen, weil sich hintergrund bewegt
		g.drawImage(Variablen.ib2, 0, Variablen.hintergrundY2, 800, 600, null);
		
		g.drawImage(Variablen.iAuto, Variablen.xAuto, Variablen.yAuto, 60, 80, null);
		repaint();

	}

}

//Nadja