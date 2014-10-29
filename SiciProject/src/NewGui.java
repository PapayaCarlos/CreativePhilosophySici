package NewGuiTest;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.border.*;

import NewGuiTest.TextPrompt.Show;

public class NewGui {



	public static void main(String[] args) {
		String calc;
		JPanel p = new JPanel();
		//JPanel p = new JPanel(new GridLayout (5,2,10,10));
		
		//JTextFields
		JTextField coef = new JTextField(6);
		JTextField exp = new JTextField(6);
		JTextField constant = new JTextField(6);
		
		TextPrompt coefPrompt = new TextPrompt("Coefficient", coef, Show.FOCUS_LOST);
		TextPrompt expPrompt = new TextPrompt("Exponent", exp, Show.FOCUS_LOST);
		TextPrompt constantPrompt = new TextPrompt("Constant", constant, Show.FOCUS_LOST);
		
		//Style for Jtext boxes
		Border line = BorderFactory.createLineBorder(Color.PINK);
		Border empty = new EmptyBorder (0,5,0,0);
									// (x, y, z , v)
									//x decides size of JTextFields(puts text in bottom, Y decides length of extra line(text goes to the right),
									// z is like X but puts text in upper part, v is like Y but text goes to the left
		CompoundBorder border = new CompoundBorder(line, empty);

		//Applying style to designated JText vars
		coef.setBorder(border);
		exp.setBorder(border);
		constant.setBorder(border);
		
		// Jpanel
		p.add(coef);
		p.add(new JLabel("* x^"));
		p.add(exp);
		p.add(new JLabel("+"));
		p.add(constant);
		
		JOptionPane.showConfirmDialog(null,  p, "Basic Derivative Calc", JOptionPane.OK_CANCEL_OPTION);
		
		//Conversion from string  to int
		String strCoef = coef.getText();
		String strExp = exp.getText();
		int intExp = Integer.parseInt(strExp);
		int intCoef = Integer.parseInt(strCoef);
		//Multiply
		int mult = intExp * intCoef;
		intExp -=1;
		if(intExp <0)
			calc = mult +"/x^" + (intExp/-1);
		else
			calc = mult +"x^"+ intExp;

		JOptionPane.showMessageDialog(null, calc );
		
	}
	


}