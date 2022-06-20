import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.Component;
import java.sql.Timestamp;


public class GUI_Game extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int highscore = -1; //checkt ob im Programm überhaupt ein Highscore grad ist.
	public GUI_Game() {
		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//Bild laden
		
		/*add(new BackgroundPanel(new ImageIcon("C:\\Users\\nikol\\OneDrive\\Desktop\\tufftuff.jpg")));
		pack();
		setVisible(true);
		*/
				
		JPanel panel = new JPanel();
		
		setTitle("High Speed Racer 2D");
		//x = 700 , y = 600
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		
		
		
		
		
		//Überschrift
		Font font = new Font("Berlin Sans", Font.BOLD | Font.ITALIC, 20);
		JLabel ueberschrift = new JLabel("High Speed Racer 2D");
		ueberschrift.setFont(font);
		ueberschrift.setBounds(250, 30, 205, 30);
		ueberschrift.setBackground(Color.yellow);
		ueberschrift.setOpaque(true);
		panel.add(ueberschrift);
		//Liste mit Highscores
		JList<String> list = new JList<>();
		//Image
		
		//Menubar
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
		
		
		
		//CloseButton mit 80 Länge und 30 Höhe als Standard
		JButton button = new JButton("Close");
		button.setBounds(595,500,80,30);
		panel.add(button);
		//PlayButton
		JButton button1 = new JButton("Play");
		button1.setBounds(300,250,80,30);
		panel.add(button1);
		
		
		//JButton button2 = new JButton("Close");
		//JButton button3 = new JButton("Close");
		//JButton button1 = new JButton("Play");
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				Variablen.startt = new Timestamp(System.currentTimeMillis());
				Main.main(null);
				
			}
		});
		
		//Layout
				//Container pane = getContentPane();
				//pane.setLayout(new FlowLayout(FlowLayout.CENTER));
				//pane.add(button1);
				//pane.add(button);
				//pane.add(button1);
		
				
		
	}
	

	/*private void bildLaden() {
		FileDialog d = new FileDialog(this, "Bilddatei laden...", FileDialog.LOAD);
		d.setVisible(true);
		m_hfulogo = d.getDirectory() + d.getFile();
		
	}*/


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
	//JLabel label1 = new JLabel(new ImageIcon("datei.png"));

	/* private int score = 0;
	 * Methode, in der die Straße evtl in 9 Boxen eingeteilt ist, und 3 Boxen passiert sind. --> score+=100;
	 * Methode die das Auto erzeugt: score = 0;
	 * public void DrawScore(Graphics g)
	 * {
	 * g.drawString("Score: "+ score, 0, "Koordinaten wo es sein soll")
	 * }
	 * 
	 * Methode die das Spiel zeichnet: --> DrawScore();
	 */

