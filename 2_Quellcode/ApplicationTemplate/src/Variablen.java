import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Variablen {
	
	static int speedup = 5, speeddown =3, speedleft=3, speedright=3;
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static JFrame jf1;
	static int breite = 800, hoehe = 600;
	static int hintergrundY1 = 0, hintergrundY2 = -600; //hintergrundbild und um -600 versetztes zweites hintergrundbild
	static int xAuto = 475, yAuto = 400; //Ort wo Auto erscheint bei beginn des spieles 
	static int xGegner1 = 260, yGegner1 = -80; 
	static int xGegner2 = 670, yGegner2 = -300;
	static int xGegner3 = 260, yGegner3 = -480;
	static int GegnerSpeed = 4;
	static int hintergrundspeed = 10; //je her die zahl desto langsamer, weil es wiederholung pro ms bedeutet
	static Box Player = new Box(xAuto,yAuto, 75, 115, null);
	static int Score = 0;
	static Box Enemy1 = new Box(xGegner1, yGegner1, 75, 115, null);
	static Box Enemy2 = new Box(xGegner2, yGegner2, 75, 115, null);
	static Box Enemy3 = new Box(xGegner3, yGegner3, 75, 115, null);
	
	static boolean gameover = false;
		
	static Label lbl1;
	
	static BufferedImage ib1, ib2;
	static BufferedImage iAuto, iGegner;
	
	public Variablen() {
	    	
	  	try {
	  		//hintergrund
	  		ib1 = ImageIO.read(new File("Pictures/DV_Vogelperspektive_Strasse_ohneAuto.png"));
	    	ib2 = ImageIO.read(new File("Pictures/DV_Vogelperspektive_Strasse_ohneAuto.png"));
	    	
	    	//Auto
	    	iAuto = ImageIO.read(new File("Pictures/AutoZuschnitt_OhneRand.png"));
	    	iGegner = ImageIO.read(new File("Pictures/AutoZuschnitt.png"));
	    	
	  	}
	  	
	  	catch(IOException a) {
	  		a.printStackTrace();
	    	System.out.println("Fehler bei der Anzeige der Bilder");
	    }
	}
}

