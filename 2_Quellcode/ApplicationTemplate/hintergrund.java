import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
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
				if(Variablen.yGegner1<540) {
					Variablen.yGegner1 += Variablen.GegnerSpeed;
					Variablen.Enemy1.y = Variablen.yGegner1;
				}
				else {
					Variablen.yGegner1 = -300;
					Variablen.Enemy1.y = Variablen.yGegner1;
					Random rnd = new Random();
					int Spur = rnd.nextInt(4)+1;
					switch (Spur) {
					case 1: Variablen.xGegner1 = 60;
							break;
					case 2: Variablen.xGegner1 = 260;
							break;
					case 3: Variablen.xGegner1 = 475;
							break;
					case 4: Variablen.xGegner1 = 670;
							break;
					}
					Variablen.Enemy1.x = Variablen.xGegner1;
				}
				if(Variablen.yGegner2<540) {
					Variablen.yGegner2 += Variablen.GegnerSpeed;
					Variablen.Enemy2.y = Variablen.yGegner2;
				}
				else {
					Variablen.yGegner2 = -300;
					Variablen.Enemy2.y = Variablen.yGegner2;
					
					Random rnd = new Random();
					int Spur = rnd.nextInt(4)+1;
					Spur = rnd.nextInt(4)+1;
					switch (Spur) {
					case 1: Variablen.xGegner2 = 60;
							break;
					case 2: Variablen.xGegner2 = 260;
							break;
					case 3: Variablen.xGegner2 = 475;
							break;
					case 4: Variablen.xGegner2 = 670;
							break;
					}
					Variablen.Enemy2.x = Variablen.xGegner2;
				}
			
				if(Variablen.yGegner3<540) {
					Variablen.yGegner3 += Variablen.GegnerSpeed;
					Variablen.Enemy3.y = Variablen.yGegner3;
				}
				else {
					Variablen.yGegner3 = -300;
					Variablen.Enemy3.y = Variablen.yGegner3;
					
					Random rnd = new Random();
					int Spur = rnd.nextInt(4)+1;
					Spur = rnd.nextInt(4)+1;
					switch (Spur) {
					case 1: Variablen.xGegner3 = 60;
							break;
					case 2: Variablen.xGegner3 = 260;
							break;
					case 3: Variablen.xGegner3 = 475;
							break;
					case 4: Variablen.xGegner3 = 670;
							break;
					}
					Variablen.Enemy3.x = Variablen.xGegner3;
				}}
		}
			
		}, 0, Variablen.hintergrundspeed);
	
}}
