import java.util.Timer;
import java.util.TimerTask;

public class Movement {
Timer Movement;

  public  Movement() {
	Movement = new Timer();
	Movement.scheduleAtFixedRate(new TimerTask() {

		@Override
		public void run() {
			if(Variablen.gameover == false) {
			if(Variablen.moveup == true) {
				if(Variablen.yAuto>0) {
					Variablen.yAuto -= Variablen.speedup;
					Variablen.Player.y -= Variablen.speedup;
				}
			}
			else if(Variablen.movedown == true) {
				if(Variablen.yAuto<=440) {
					Variablen.yAuto += Variablen.speeddown;
					Variablen.Player.y += Variablen.speeddown;
				}
			}
				if(Variablen.moveleft == true) {
					if(Variablen.xAuto>0) {
						Variablen.xAuto -= Variablen.speedleft;
						Variablen.Player.x -= Variablen.speedleft;
					}
				}
				else if(Variablen.moveright == true) {
					if(Variablen.xAuto<=700) {
						Variablen.xAuto += Variablen.speedright;
						Variablen.Player.x += Variablen.speedright;
					}
		}
		}
		
		}},0,10);
	}}
