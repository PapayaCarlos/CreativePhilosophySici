import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
public class NewGui {

	public static void main(String[] args) {
		JPanel p = new JPanel(new GridLayout (5,2,10,10));
		
		JTextField familyName = new JTextField("im familyName",10);
		JTextField firstname = new JTextField("im firstName",10);
		JTextField secondName= new JTextField("pussy", 5);
		
		Border line = BorderFactory.createLineBorder(Color.PINK);
		Border empty = new EmptyBorder (0,5,0,0);
									// (x, y, z , v)
									//x decides size of JTextFields(puts text in bottom, Y decides length of extra line(text goes to the right),
									// z is like X but puts text in upper part, v is like Y but text goes to the left
		
		
		CompoundBorder border = new CompoundBorder(line, empty);

		familyName.setBorder(border);
		firstname.setBorder(border);
		secondName.setBorder(border);
		
		p.add(new JLabel("Family Name : "));
		p.add(familyName);
		p.add(new JLabel("First Name : "));
		p.add(firstname);
		p.add(new JLabel("\nSgundo\n"));
		p.add(secondName);

		JOptionPane.showConfirmDialog(null,  p, "Family and fist name : ", JOptionPane.OK_CANCEL_OPTION);


	}

}
