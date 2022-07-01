import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * 
 * @author Nikolas
 * 
 * @version 1.0
 *
 */

public class BackgroundPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

ImageIcon icon;
/**
 * Initialisiert das Bild
 * @param icon
 */
	
public BackgroundPanel(ImageIcon icon) {
	this.icon = icon;
}
/**
 * Lädt das Bild rein und zeichnet es
 */
protected void paintComponent(Graphics f) {
	super.paintComponent(f);
	if (this.icon != null) {
		f.drawImage(icon.getImage(), 0, 0, this);
	}
}
/**
 * Schneidet das Bild zurecht
 */
public Dimension getPreferredSize() {
	if (icon != null) {
		return new Dimension(icon.getIconWidth(),icon.getIconHeight());
	} else {
			return super.getPreferredSize();
		}
	}
}

