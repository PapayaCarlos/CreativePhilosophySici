package Program;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
			strResult = "El dinero que le dio no es suficiente.";
		else if( dblCantPagada == 0)
			strResult = "Le falta poner la cantidad pagada";
		else if(dblCantPagar ==0)
			strResult = "Le falta poner la cantidad que va pagar.";
		else{	
		result = dblCantPagada -dblCantPagar;
		strResult = Double.toString(result);
		}
		return strResult;
	}

	public static JFrame calcFrame(){
		JFrame frame = new JFrame("Testing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		final JPanel p = new JPanel(new GridLayout (5,2,10,10));
		final JTextField cantPagar = new JTextField(10);
		final JTextField cantPagada = new JTextField(10);
		final JLabel resultLabel = new JLabel();
		
		//boolean check = true;
		p.add(new JLabel("Cantidad de dinero que va pagar el cliente: "));
		p.add(cantPagar);
		p.add(new JLabel("Cantidad de dinero que le dio el cliente: "));
		p.add(cantPagada);
		
		p.add(resultLabel);
		resultLabel.setVisible(false);
		JButton button = new JButton("Resultado");
		p.add(button);
		button.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent event){
			resultLabel.setText(mathCalc(cantPagar, cantPagada));
			resultLabel.setVisible(true);
		}
		});

		frame.add(p);
		frame.pack();
		return frame;
	}
}
