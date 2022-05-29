package highspeedracer2D;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
Timer movement;

	public Movement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
	
			@Override
			public void run() {
	
				if(Variablen.moveup == true) {
					if(Variablen.yAuto>0) {
						Variablen.yAuto -= Variablen.speedup;
					}
				}
				
				else if(Variablen.movedown == true) {
					if(Variablen.yAuto <= 500) {
						Variablen.yAuto += Variablen.speeddown;
					}
				}
				
				if(Variablen.moveleft == true) {
					if(Variablen.xAuto > 0) {
						Variablen.xAuto -= Variablen.speedleft;
					}
				}
				
				else if(Variablen.moveright == true) {
					if(Variablen.xAuto <= 750) {
						Variablen.xAuto += Variablen.speedright;
					}
				}
			}
			
		}, 0, 10);
	}
}

// Marcel