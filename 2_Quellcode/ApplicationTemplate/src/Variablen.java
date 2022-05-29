package highspeedracer2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Variablen {
	
    static JFrame jf1;
	static int breite = 800, hoehe = 600;
	static int hintergrundY1 = 0, hintergrundY2 = -600; //hintergrundbild und um -600 versetztes zweites hintergrundbild
	static int xAuto = 400, yAuto = 300; //Ort wo Auto erscheint bei beginn des spieles 
	static int hintergrundspeed = 20; //je höher die zahl desto langsamer, weil es wiederholung pro ms bedeutet
	
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;	
	static Label lbl1;
	
	static BufferedImage ib1, ib2;
	static BufferedImage iAuto;
	
	public Variablen() {
	    	
	  	try {
	  		//hintergrund
	  		ib1 = ImageIO.read(new File("Bildder/Strasse_ohneAuto.png"));
	    	ib2 = ImageIO.read(new File("Bildder/Strasse_ohneAuto.png"));
	    	
	    	//Auto
	    	iAuto = ImageIO.read(new File("Bildder/AutoZuschnitt_kleiner.png"));
	    	
	  	}
	  	
	  	catch(IOException a) {
	  		a.printStackTrace();
	    	System.out.println("Fehler bei der Anzeige der Bilder");
	    }
	}
}

