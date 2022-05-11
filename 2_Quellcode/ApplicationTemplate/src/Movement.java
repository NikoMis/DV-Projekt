import java.util.Timer;
import java.util.TimerTask;

public class Movement {
Timer movement;
	public Movement(){
		movement=new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Variablen.moveup=true) {
					
					Variablen.yAuto +=Variablen.speedup;
					//Variablen.xAuto=0;
				}
                    if(Variablen.movedown=true) {
					
					Variablen.yAuto -=Variablen.speeddown;
					//Variablen.xAuto=0;
				
			}
                     if(Variablen.moveleft=true) {
     					
     					//Variablen.yAuto= 0;
     					Variablen.xAuto -= Variablen.speedleft;;
                     
                     }
                     if(Variablen.moveright=true) {
     					
     					//Variablen.yAuto=0;
     					Variablen.xAuto +=Variablen.speedright;
                     }
			}
	},0, 10);
}
}
