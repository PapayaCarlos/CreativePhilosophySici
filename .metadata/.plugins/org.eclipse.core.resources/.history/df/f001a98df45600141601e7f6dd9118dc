import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * @author PapayaCarlos
 * 
 */
public class cojerDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileNameString = null;
		fileNameString = JOptionPane.showInputDialog("Nombre archivo nuevo");

		try {

			PrintWriter pw = new PrintWriter(fileNameString);//para crear un archivo segun el input que el usuario entre.(arreglar)

			UIManager UI = new UIManager();//para los colores (falta buscar forma de poner colores mas claros)

			do {

				UI.put("OptionPane.background", Color.BLUE);
				UI.put("OptionPane.messagebackground", Color.BLUE);
				UI.put("Panel.background", Color.blue);

				String nombre = JOptionPane
						.showInputDialog("Escriba su nombre:");
				String email = JOptionPane.showInputDialog("Escriba su email:");
				String numero = JOptionPane
						.showInputDialog("Escriba su numero de telefono:");
				String numSocio = JOptionPane
						.showInputDialog("Escriba su numero de socio:");

				String pregunta = JOptionPane
						.showInputDialog("Desea guardar otro ID? (Dejar sin contestar para terminar)");//(arreglar para que la persona diga que no y haga exit solo.)

				pw.println(nombre);
				pw.println(email);
				pw.println(numero);
				pw.println(numSocio);

				if (pregunta == null || pregunta.isEmpty())
					break; // para salir del programa (arreglar para que la persona diga que no y haga exit solo.)

			} while (true);

			pw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
