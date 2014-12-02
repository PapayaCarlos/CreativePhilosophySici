package Program;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author PapayaCarlos
 * 
 */

public class GuiApp extends JFrame {// Falta ponerle titulo al frame

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new GuiApp();
	}
	
	public GuiApp() {
	
		JFrame frame = new JFrame("Creative Solutions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/reader.png"));
		
		JButton[] buttons = new JButton[4];
		buttons[0] = new JButton(new ImageIcon("resources/images/write.png"));
		buttons[1] = new JButton(new ImageIcon("resources/images/reader.png"));
		buttons[2] = new JButton( new ImageIcon("resources/images/Magnifying_glass.png"));
		buttons[3] = new JButton(new ImageIcon("resources/images/icon_cashregister.gif"));

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
	}
}
