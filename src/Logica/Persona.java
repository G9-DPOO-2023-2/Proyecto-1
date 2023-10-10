package Logica;

public class Persona 
{
	//**********************************************
	//Atributos
	//**********************************************
	/**
	 * Es el nombre de cada una de las personas
	 */
	private String nombre;
	
	/**
	 * Es el identificador de cada una de las personas
	 */
	private long cedula;
	
	/**
	 * Es el número telefonico por el cual se contacta a una persona
	 */
	private long cel;
	
	/**
	 * Es el medio por el cual se le pueden enviar correos y posiblemente sera 
	 * el username de cada uno de los que esten registrados
	 */
	private String email;
	
	/**
	 * Es la cantidad de años que lleva un trabajador en la empresa
	 */
	private int anosEmpresa;
	
	//********************************************************************
	//Constructor
	//********************************************************************
	public Persona(String nombre, long cedula, long cel, String email, int anosEmpresa) 
	{
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.cel = cel;
		this.email = email;
		this.anosEmpresa = anosEmpresa;
	}
	
	//*******************************************************************************************
	//Metodos para consultar los atributos
	//*******************************************************************************************
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public long getCedula() 
	{
		return cedula;
	}

	public void setCedula(long cedula) 
	{
		this.cedula = cedula;
	}

	public long getCel() {
		return cel;
	}

	public void setCel(long cel) 
	{
		this.cel = cel;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public int getAnosEmpresa() 
	{
		return anosEmpresa;
	}

	public void setAnosEmpresa(int anosEmpresa) 
	{
		this.anosEmpresa = anosEmpresa;
	}
}
