package Program;
/**
 * @author PapayaCarlos
 * 
 */
public class IdStudent {

	public IdStudent(String string, String string2, String string3,
			String string4) {
		// TODO Auto-generated constructor stub
		setNombre(string);
		setEmail(string2);
		setNumero(string3);
		setNumSocio(string4);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getNumero() {
		return numero;
	}

	public String getNumSocio() {
		return numSocio;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
	}

	private String nombre, email, numero, numSocio;// setters y getters ;o
}