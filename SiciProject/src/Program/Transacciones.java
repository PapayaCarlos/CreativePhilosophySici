package Program;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Transacciones {
	private static double cantidadPagar;
	private static double cantidadPagada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cantidadPagarString = null;
		String cantidadPagadaString = null;
		
		cantidadPagadaString = JOptionPane
				.showInputDialog(" Total a pagar: $ ");
		cantidadPagarString = JOptionPane
				.showInputDialog("Entre cuanto dinero dio el cliente: $   ");
		
		cantidadPagar = Double.parseDouble(cantidadPagarString);
		cantidadPagada = Double.parseDouble(cantidadPagadaString);
		
		double change = (cantidadPagar - cantidadPagada);
		
		Component parentComponent = null;
		String title = "Application Sici(MiniCashier)";
		String message = "CAMBIO: $ " + change;
		int messageType = 0;
		JOptionPane.showMessageDialog(parentComponent, message, title,
				messageType);
	}
}
