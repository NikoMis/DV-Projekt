import java.util.Timer;
import java.util.TimerTask;

public class hintergrund {
	
	Timer back;
	
	public hintergrund() {
		
		
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask() {
			
		
			@Override
			public void run() {
				if (Variablen.gameover == false) {
					
				if(Variablen.hintergrundY1<596) {
					Variablen.hintergrundY1 += 2;
				}
				else {
					Variablen.hintergrundY1 = -600;
				}
				
				if(Variablen.hintergrundY2<596) {
					Variablen.hintergrundY2 += 2;
				}
				else {
					Variablen.hintergrundY2 = -600;
				}
			}
		}
			
		}, 0, Variablen.hintergrundspeed);
	
}}