package NewGuiTest;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.border.*;
import NewGuiTest.TextPrompt.Show;

/**
 * @author ziekhart, Andres A. Acevedo
 *
 */

public class NewGui {

	public static void main(String[] args) {
		Toolkit.getDefaultToolkit().beep();
		JPanel p = new JPanel(new GridLayout (5,2,10,10));
		
		//JTextFields
		JTextField name = new JTextField(10);
		JTextField email = new JTextField(10);
		JTextField tel = new JTextField(10);
		JTextField numSocio = new JTextField(10);
		
		TextPrompt namePrompt = new TextPrompt("Nombre", name, Show.FOCUS_LOST);
		TextPrompt emailPrompt = new TextPrompt("E-mail", email, Show.FOCUS_LOST);
		TextPrompt telPrompt = new TextPrompt("Telefono", tel, Show.FOCUS_LOST);
		TextPrompt numSocioPrompt = new TextPrompt("Numero de Socio", numSocio, Show.FOCUS_LOST);
		
		//Style for Jtext boxes
		Border line = BorderFactory.createLineBorder(Color.PINK);
		Border empty = new EmptyBorder (0,5,0,0);
									// (x, y, z , v)
									//x decides size of JTextFields(puts text in bottom, Y decides length of extra line(text goes to the right),
									// z is like X but puts text in upper part, v is like Y but text goes to the left
		CompoundBorder border = new CompoundBorder(line, empty);

		//Applying style to designated JText vars
		name.setBorder(border);
		email.setBorder(border);
		tel.setBorder(border);
		numSocio.setBorder(border);
		
		// Jpanel
		p.add(new JLabel("Nombre"));
		p.add(name);
		p.add(new JLabel("E-mail"));
		p.add(email);
		p.add(new JLabel("Telefono"));
		p.add(tel);
		p.add(new JLabel("Numero de Socio"));
		p.add(numSocio);
		
		JOptionPane.showConfirmDialog(null,  p, "Info taker", JOptionPane.OK_CANCEL_OPTION);
		
	}
	
}
