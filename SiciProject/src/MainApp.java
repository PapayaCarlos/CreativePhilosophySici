import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdStudent Id[] = new IdStudent[3]; // ARRAY 0, 1, 2, 
		Id = cojerDatos("PruebaAlpha.txt");
		mostrarId(Id);
	}

	private static void mostrarId(IdStudent[] Id) {
		for (int i = 0; i < Id.length; i++) {
			if (Id[i] == null)
				break;
			showId(Id[i]);
		} // for
	}

	private static IdStudent[] cojerDatos(String archivoString) {
		IdStudent dummies[] = new IdStudent[4];
		String nombre = null;
		String email = null;
		String numero = null;
		String numSocio = null;
		try {
			Scanner scanner = new Scanner(new File(archivoString));
			int index = 0;
			while (scanner.hasNext()) {
				nombre = scanner.nextLine();
				email = scanner.nextLine();
				numSocio = scanner.nextLine();
				numero = scanner.nextLine();
			//	scanner.nextLine(); // limpiar el buffer ( medio da-ado)
				dummies[index] = new IdStudent(nombre, email, numSocio, numero);
				index++;
			}// while
			scanner.close();
			// vvvvvvvvvvbuscar errores internos.vvvvvvvvvvvvv
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("File not found !!!!! ");
		}
		return dummies;
	} // cojerDatos

	private static void showId(IdStudent Id) {
		// TODO Auto-generated method stub
		Component parentComponent = null;
		String message = "\n Nombre:  " + Id.getNombre()+  "\n Email:  "  + Id.getEmail()+ "\n Telefono:  "
				 + Id.getNumero() + "\n Numero Socio:  "
				+ Id.getNumSocio(); // sort del input de el
														// usuario
		String title = "Application Sici";
		int messageType = 0;
		JOptionPane.showMessageDialog(parentComponent, message, title,
				messageType);
	} // showID
} // class