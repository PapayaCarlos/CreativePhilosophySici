package Program;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import Program.TextPrompt.Show;
import java.util.ArrayList;

/**
 * @author github.com/ziekhart/, Andres A. Acevedo
 */

public class DataEntry {

	public static void main(String[] args) throws IOException {
		JPanel p = new JPanel(new GridLayout (5,2,10,10));
		JPanel loopy = new JPanel();

		PrintWriter pw = new PrintWriter (new FileWriter("resources/test.txt", true));

		boolean check;
		//JTextFields
		JTextField name = new JTextField(10);
		JTextField email = new JTextField(10);
		JTextField tel = new JTextField(10);
		JTextField numSocio = new JTextField(10);

		//Style for JTextFields
		TextPrompt namePrompt = new TextPrompt("Nombre", name, Show.FOCUS_LOST);
		TextPrompt emailPrompt = new TextPrompt("E-mail", email, Show.FOCUS_LOST);
		TextPrompt telPrompt = new TextPrompt("Telefono", tel, Show.FOCUS_LOST);
		TextPrompt numSocioPrompt = new TextPrompt("Numero de Socio", numSocio, Show.FOCUS_LOST);

		namePrompt.setForeground( Color.BLUE );
		namePrompt.changeAlpha(0.5f);

		emailPrompt.setForeground( Color.BLUE );
		emailPrompt.changeAlpha(0.5f);

		telPrompt.setForeground( Color.BLUE );
		telPrompt.changeAlpha(0.5f);

		numSocioPrompt.setForeground( Color.BLUE );
		numSocioPrompt.changeAlpha(0.5f);

		//Style for Jtext boxes
		Border line = BorderFactory.createLineBorder(Color.BLUE);
		Border empty = new EmptyBorder (0,5,0,0);
		// (x, y, z , v)
		//x decides size of JTextFields(puts text in bottom, Y decides length of extra line(text goes to the right),
		// z is like X but puts text in upper part, v is like Y but text goes to the left
		CompoundBorder border = new CompoundBorder(line, empty);

		//Applying style to designated JText variables
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
		loopy.add(new JLabel("Deseas entrar otro usuario?"));


		do
		{
			if(JOptionPane.showConfirmDialog(null,  p, "Entrar ID", 0)== JOptionPane.NO_OPTION)
			{
				break;
			}

			Toolkit.getDefaultToolkit().beep();
			
			
			//String versions
			String strName = name.getText();
			String strEmail = email.getText();
			String strTel = tel.getText();
			String strNumSocio = numSocio.getText();
			Socios miembro = new Socios(strName, strEmail, strTel, strNumSocio);
			ArrayList<Socios> members = new ArrayList<Socios>();
			members.add(miembro);

			pw.println(strName);
			pw.println(strEmail);
			pw.println(strTel);
			pw.println(strNumSocio);
			pw.println("");
			pw.flush();

			name.setText("");
			email.setText("");
			tel.setText("");
			numSocio.setText("");

			if(JOptionPane.showConfirmDialog(null, loopy, "More", 0)==JOptionPane.YES_OPTION)
			{
				check = true;
			}
			else
			{
				check= false;
			}

		}while(check == true);
		pw.close();
	}
}
