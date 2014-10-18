import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author PapayaCarlos
 * 
 */
public class guiApp extends JFrame {// Falta ponerle titulo al frame

	public guiApp() {

		JButton[] buttons = new JButton[4];
		buttons[0] = new JButton("Introducir datos para ID", new ImageIcon(
				"images/ICON-Bureau-ID-Card-Service.png"));
		buttons[1] = new JButton("Leer ID", new ImageIcon("images/reader.jpg"));
		buttons[2] = new JButton("Exit", new ImageIcon(
				"images/button_cancel (1).png"));
		buttons[3] = new JButton("Mini Cashier", new ImageIcon(
				"images/icon_cashregister.gif"));

		buttons[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cojerDatos.main(null);
			}
		});

		buttons[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				MainApp.main(null);
			}

		});
		buttons[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				System.exit(0);
			}
		});
		
		buttons[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				Transaciones.main(null);
			}

		});
		add(buttons[0], BorderLayout.WEST);
		add(buttons[1], BorderLayout.CENTER);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.NORTH);

		pack();
		// setSize

		setLocationRelativeTo(null);
		setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new guiApp();
	}

}
