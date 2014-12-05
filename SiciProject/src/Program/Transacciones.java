package Program;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * @authors github.com/ziekhart/, Andres A. Acevedo & Carlos Figueroa
 */
public class Transacciones {

	public static void main(String[] args) {
		calcFrame();
	}

	public static String mathCalc(JTextField cantPagar, JTextField cantPagada){
		double dblCantPagar, dblCantPagada, result;
		String strResult=null;
		dblCantPagar = Double.parseDouble(cantPagar.getText());
		dblCantPagada = Double.parseDouble(cantPagada.getText());
		if(dblCantPagada < dblCantPagar)
			return "El dinero que le dio no es suficiente.";
		else{	
			result = dblCantPagada -dblCantPagar;
			strResult = Double.toString(result);
			return "Resultado: $"+ strResult;
		}

	}

	public static JFrame calcFrame(){
		JFrame frame = new JFrame("Caja registradora");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources/images/icon_cashregister.gif"));
		JButton button = new JButton("Resultado");
		final JPanel p = new JPanel(new GridLayout (5,2,10,10));
		final JTextField cantPagar = new JTextField(10);
		final JTextField cantPagada = new JTextField(10);
		final JLabel resultLabel = new JLabel();
		frame.setResizable(false);


		p.add(new JLabel(" Cantidad de dinero que va pagar el cliente:  $"));
		p.add(cantPagar);
		p.add(new JLabel(" Cantidad de dinero que le dio el cliente:        $"));
		p.add(cantPagada);
		p.add(button, FlowLayout.TRAILING);
		p.add(new JLabel(""));
		p.add(new JLabel(""));
		p.add(resultLabel,BorderLayout.SOUTH);
		resultLabel.setVisible(false);

		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event){
				resultLabel.setText(mathCalc(cantPagar, cantPagada));
				resultLabel.setVisible(true);
			}
		});

		frame.setResizable(false);
		frame.add(p);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		return frame;
	}
}
