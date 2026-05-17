import java.awt.*;
import javax.swing.*;

public class VueCalculatrice extends JFrame {
	
	JButton zero = new JButton("0");
	JButton un = new JButton("1");
	JButton deux = new JButton("2");
	JButton trois = new JButton("3");
	JButton quatre = new JButton("4");
	JButton cinq = new JButton("5");
	JButton six  = new JButton("6");
	JButton sept = new JButton("7");
	JButton huit = new JButton("8");
	JButton neuf = new JButton("9");
	JButton plus = new JButton("+");
	JButton moins = new JButton("-");
	JButton diviser = new JButton("/");
	JButton multiplication = new JButton("*");
	JButton delete = new JButton("C");
	JButton egale = new JButton("=");
	JButton point = new JButton(".");

	JTextField zone ;

	public VueCalculatrice() {
		
		this.setTitle("Calculette");
		this.setPreferredSize(new Dimension(500,500));
		this.getContentPane().setLayout(new BorderLayout());

		zone = new JTextField();
		zone.setHorizontalAlignment(SwingConstants.RIGHT);

		JPanel chiffres = new JPanel();
		chiffres.setLayout(new GridLayout(4,3)); 

		JPanel calcul = new JPanel();
		calcul.setLayout(new GridLayout(5,1));
						
		calcul.add(delete);
		calcul.add(plus);
		calcul.add(moins);
		calcul.add(multiplication);
		calcul.add(diviser);

		chiffres.add(un);
		chiffres.add(deux);
		chiffres.add(trois);
		chiffres.add(quatre);
		chiffres.add(cinq);
		chiffres.add(six);
		chiffres.add(sept);
		chiffres.add(huit);
		chiffres.add(neuf);
		chiffres.add(zero);
		chiffres.add(point);
		chiffres.add(egale);

		
		this.getContentPane().add(zone,BorderLayout.NORTH);
		this.getContentPane().add(chiffres,BorderLayout.CENTER);
		this.getContentPane().add(calcul,BorderLayout.EAST);
		
		
	
	}

	

}
