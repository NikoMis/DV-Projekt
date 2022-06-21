import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keys implements KeyListener {
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
		
	
	
		@Override
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				Variablen.moveup=true; //move up=schneller
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				Variablen.movedown=true; //move down =langsamer
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				Variablen.moveleft=true; //move left = links
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				Variablen.moveright=true; //move right = rechts
				
			}
	}

		
		
	@Override
	public void keyReleased(KeyEvent e) {

				
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					Variablen.moveup=false;
		}
				if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					Variablen.movedown=false;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					Variablen.moveleft=false;
	}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					Variablen.moveright=false;
					
	}
	
	}
}
