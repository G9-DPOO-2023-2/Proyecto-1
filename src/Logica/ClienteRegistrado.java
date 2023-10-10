package Logica;

public class ClienteRegistrado extends Persona
{
	//*******************************************************
	//Atributos
	//******************************************************
	
	/**
	 * Es la fecha de nacimiento del cliente su orden es 
	 * día-mes-año
	 */
	private String fechaNacimiento;
	
	/**
	 * Es el lugar de nacimiento del cliente registrado
	 */
	private String nacionalidad;
	
	/**
	 * Es el lugar donde saco su documento de identidad
	 */
	private String paisExpedicion;
	
	//*******************************************************
	//Constructor
	//*******************************************************
	public ClienteRegistrado(String nombre, long cedula, long cel, String email, int anosEmpresa, String fechaNacimiento, 
			String nacionalidad, String paisExpedicion) //Llama al constructor de la clase Persona
	{
		super(nombre, cedula, cel, email, anosEmpresa);
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.paisExpedicion = paisExpedicion;
	}
	
	//***************************************************************
	//Metodos para consultar los Atributos
	//**************************************************************
	public String getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() 
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) 
	{
		this.nacionalidad = nacionalidad;
	}

	public String getPaisExpedicion() 
	{
		return paisExpedicion;
	}

	public void setPaisExpedicion(String paisExpedicion) 
	{
		this.paisExpedicion = paisExpedicion;
	}
}
