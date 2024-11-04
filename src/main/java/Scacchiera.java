import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Alessio Manià - IN2000247
 */
public class Scacchiera extends JFrame {
	JPanel pannello;

	public Scacchiera() {

		pannello = new JPanel(new GridLayout(8,8));

		for (int i=1; i<=8; i++)
			for (int j=1; j<=8; j++) {
				JPanel p = new JPanel();
				if ((i+j)%2==0) {
					p.setBackground(Color.WHITE);
					p.setToolTipText("prova");
					p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				} else {
					p.setBackground(Color.YELLOW);
					p.setBorder(BorderFactory.createMatteBorder(4, 4, 0, 0, Color.BLACK));
					JLabel label = new JLabel("X");
					label.setSize(p.getSize());

					p.add(label);
				}

				p.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(e.getSource());
						JPanel p = (JPanel) e.getSource();
						p.setBackground(Color.RED);
					}
				});

				pannello.add(p);
			}
		setContentPane(pannello);
		setTitle("Scacchiera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(600,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Scacchiera frame = new Scacchiera();
	}

}
