package Program;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 * @authors PapayaCarlos, & github.com/ziekhart/, Andres A. Acevedo
 * 
 */
public class GuiApp extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new GuiApp();
	}
	
	public GuiApp() {
	
		JFrame frame = new JFrame("Creative Systems");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources/images/reader.png"));
		frame.setResizable(false);
		
		JButton[] buttons = new JButton[4];
		buttons[0] = new JButton("Entrar ID nuevo", new ImageIcon("resources/images/write.png"));
		buttons[1] = new JButton("Ver datos de ID",new ImageIcon("resources/images/reader.png"));
		buttons[2] = new JButton("Buscar ID",new ImageIcon("resources/images/Magnifying_glass.png"));
		buttons[3] = new JButton("Caja registradora",new ImageIcon("resources/images/icon_cashregister.gif"));
		//Formatting
		buttons[0].setVerticalTextPosition(SwingConstants.BOTTOM);
		buttons[0].setVerticalAlignment(SwingConstants.BOTTOM);
		buttons[0].setHorizontalTextPosition(SwingConstants.CENTER);

		buttons[1].setVerticalTextPosition(SwingConstants.BOTTOM);
		buttons[1].setVerticalAlignment(SwingConstants.BOTTOM);
		buttons[1].setHorizontalTextPosition(SwingConstants.CENTER);
		
		buttons[2].setVerticalTextPosition(SwingConstants.BOTTOM);
		buttons[2].setVerticalAlignment(SwingConstants.TOP);
		buttons[2].setHorizontalTextPosition(SwingConstants.CENTER);
		
		buttons[3].setVerticalTextPosition(SwingConstants.BOTTOM);
		buttons[3].setVerticalAlignment(SwingConstants.TOP);
		buttons[3].setHorizontalTextPosition(SwingConstants.CENTER);
		
		buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataEntry.main(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		buttons[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					DataRetrieval.main(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		});
		buttons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DataManagement.main(null);
			}
		});
		buttons[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Transacciones.main(null);
			}

		});
		frame.add(buttons[0], BorderLayout.WEST);
		frame.add(buttons[1], BorderLayout.CENTER);
		frame.add(buttons[2], BorderLayout.EAST);
		frame.add(buttons[3], BorderLayout.NORTH);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
