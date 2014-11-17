package Program;

public class Socios {
	
	private String name;
	private String email;
	private String tel;
	private String numSocio;
	
	public Socios(String nombre, String correo, String cel, String numero)
	{
		nombre = name;
		correo = email;
		cel = tel;
		numero = numSocio;
	}
	
	public void setName(String nombre)
	{
		nombre = name;
	}
	
	public void setEmail(String correo)
	{
		correo = email;
	}
	
	public void setTel(String cel)
	{
		cel = tel;
	}
	
	public void setNum(String numero)
	{
		numero = numSocio;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getTel()
	{
		return tel;
	}
	
	public String getNum()
	{
		return numSocio;
	}

}
