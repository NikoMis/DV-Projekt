import javax.swing.JFrame;

public class GUI_Racerr {

	public GUI_Racerr() {
		Variablen.jf1 = new JFrame();
		Variablen.jf1.setSize(Variablen.breite, Variablen.hoehe);
		Variablen.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variablen.jf1.setLocationRelativeTo(null);
		Variablen.jf1.setLayout(null);
		Variablen.jf1.setTitle("High Speed Racer 2D");
		Variablen.jf1.setResizable(false);
		Variablen.jf1.addKeyListener(new Keys());
		Variablen.jf1.requestFocus();
		Variablen.jf1.setVisible(true);
		
		Variablen.lbl1 = new Label();
		Variablen.lbl1.setBounds(0, 0, Variablen.breite, Variablen.hoehe);
		Variablen.lbl1.setVisible(true);		
		Variablen.jf1.add(Variablen.lbl1);
	}
}
