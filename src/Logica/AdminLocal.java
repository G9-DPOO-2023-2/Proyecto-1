package Logica;

public class AdminLocal extends Persona
{
	//**********************************************************
	//Atributos especificos de la clase
	//**********************************************************
	
	private String sede;
	
	//**********************************************************
	//Constructor
	//**********************************************************
	public AdminLocal(String nombre, long cedula, long cel, String email, int anosEmpresa, String sede) 
	{
		super(nombre, cedula, cel, email, anosEmpresa); //Llama al constructor de la clase Persona
		this.sede = sede;
	}
	
	//***********************************************************
	//Metodos para consultar los atributos
	//**********************************************************
	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
	
	//**********************************************************
	//Metodos Especifico
	//**********************************************************
}
