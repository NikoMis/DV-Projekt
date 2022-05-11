import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class GUI_Racer extends JFrame{
private String m_hfulogo;

	public GUI_Racer() {
		
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
		JList<String> list = new JList<>();
		
		
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
		
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Layout
		//Container pane = getContentPane();
		//pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		//pane.add(button1);
		//pane.add(button);
		//pane.add(button1);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
				{
			public void run() {
				GUI_Racer g = new GUI_Racer();
				g.setVisible(true);
			}
				});
		}
}
//Weiterer Befehl zum Bild Laden
//JLabel label1 = new JLabel(new ImageIcon("datei.png"));
	

