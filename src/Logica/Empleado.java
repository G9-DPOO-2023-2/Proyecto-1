package Logica;

public class Empleado extends Persona
{
	//**********************************************************
		//Atributos especificos de la clase
		//**********************************************************
		
		private String sede;
		
		//**********************************************************
		//Constructor
		//**********************************************************
		public Empleado(String nombre, String cedula, String cel, String email, String anosEmpresa, String sede, String contraseña) 
		{
			super(cedula, contraseña, nombre, cel, email, anosEmpresa); //Llama al constructor de la clase Persona
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
