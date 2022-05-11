import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
ImageIcon icon;

public BackgroundPanel(ImageIcon icon) {
	this.icon = icon;
}
protected void paintComponent(Graphics f) {
	super.paintComponent(f);
	if (this.icon != null) {
		f.drawImage(icon.getImage(), 0, 0, this);
	}
}
public Dimension getPreferredSize() {
	if (icon != null) {
		return new Dimension(icon.getIconWidth(),icon.getIconHeight());
	} else {
			return super.getPreferredSize();
		}
	}
}

