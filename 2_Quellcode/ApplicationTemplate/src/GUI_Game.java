import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * 
 * @author Nikolas
 * 
 * @version 1.1
 *
 */
public class GUI_Game extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	public GUI_Game() {
		
		//Bild laden
		add(new BackgroundPanel(new ImageIcon("C:\\Users\\nikol\\OneDrive\\Desktop\\auto.png")));
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("High Speed Racer 2D");
		//x = 700 , y = 600
		setSize(700,600);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		
		add(panel);
		panel.setLayout(null);
		// Hintergrundfarbe für ein GUI ohne Bild
		
		//panel.setBackground(Color.red);
		
		// Erzeugt eine Überschrift.
		 
		
		Font font = new Font("Berlin Sans", Font.BOLD | Font.ITALIC, 20);
		JLabel ueberschrift = new JLabel("High Speed Racer 2D");
		ueberschrift.setFont(font);
		ueberschrift.setBounds(250, 30, 205, 30);
		ueberschrift.setBackground(Color.black);
		ueberschrift.setOpaque(true);
		setVisible(true);
		panel.add(ueberschrift);
		
		// Erzeugt das Menuebar
		JMenuBar menu = new JMenuBar();
		JMenu datei = new JMenu("Menü");
		JMenuItem CG = new JMenuItem("Close Game");
		CG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}});
		datei.add(CG);
		menu.add(datei);
		setJMenuBar(menu);
		
		// Buttons mit 80 Länge und 30 Höhe als Standard
		 
		//PlayButton
		JButton button1 = new JButton("Play");
		button1.setBounds(300,250,80,30);
		panel.add(button1);
		
		//PlayButtonAction
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				Main.main(null);
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		new GUI_Game();
		
		
		EventQueue.invokeLater(new Runnable()
				{
		public void run() {
				GUI_Game g = new GUI_Game();
				g.setVisible(true);
			}
				});
		}
}
