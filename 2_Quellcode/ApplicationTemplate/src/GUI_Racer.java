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
		
		//super(titel);
		//bildLaden();
		//this.setLayout(new BorderLayout());
		//this.add(BorderLayout.CENTER, new bildflaeche(m_hfulogo));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("High Speed Racer 2D");
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
		//CloseButton
		JButton button = new JButton("Close");
		button.setBounds(650,550,20,20);
		
		//JButton button2 = new JButton("Close");
		//JButton button3 = new JButton("Close");
		JButton button1 = new JButton("Play");
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Layout
				Container pane = getContentPane();
				pane.setLayout(new FlowLayout(FlowLayout.CENTER));
				pane.add(button1);
				pane.add(button);
				//pane.add(button1);
		
				
		
	}
	

	/*private void bildLaden() {
		FileDialog d = new FileDialog(this, "Bilddatei laden...", FileDialog.LOAD);
		d.setVisible(true);
		m_hfulogo = d.getDirectory() + d.getFile();
		
	}*/


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
	

