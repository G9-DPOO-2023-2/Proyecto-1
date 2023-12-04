package Logica;

import java.util.ArrayList;


public class AdminGeneral extends Persona
{
	ArrayList<String> infoNuevoVehiculo;
	
	//********************************************************************************
	//Esta clase hereda los atributos de persona y no tiene ningun atributo espeifico de la clase
	//*********************************************************************************
	
	
	//*****************************************************************************
	//Constructor
	//*****************************************************************************
	
	public AdminGeneral(String nombre, String cedula, String cel, String email, String anosEmpresa, String contraseña) {
		super(nombre, cedula, cel, email, anosEmpresa,contraseña);//Llama al constructor de la clase Persona
		infoNuevoVehiculo = new ArrayList<String>();
		
	}
	
	//*****************************************************************************
	//Metodos especificos (No hay metodos para consultar Atributos)
	//*****************************************************************************
	
	public void registrarCompraNuevoVehiculo(String placa, String marca, String modelo, String ano, String color, String trasmision, String ubicacion, String alquilado, String estado, String tipo)
	{
		infoNuevoVehiculo.add(marca);
		infoNuevoVehiculo.add(modelo);
		infoNuevoVehiculo.add(ano);
		infoNuevoVehiculo.add(color);
		infoNuevoVehiculo.add(trasmision);
		infoNuevoVehiculo.add(ubicacion);
		infoNuevoVehiculo.add(alquilado);
		infoNuevoVehiculo.add(estado);
		infoNuevoVehiculo.add(tipo);
		
		Categoria categorias = new Categoria ();
		if (tipo.equals("SUV")) 
		{
			categorias.getSUV().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("pequeño"))
		{
			categorias.getPequeno().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("lujo"))
		{
			categorias.getLujo().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("deportivo"))
		{
			categorias.getDeportivo().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("vans"))
		{
			categorias.getVans().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("moto"))
		{
			categorias.getMoto().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("ATV"))
		{
			categorias.getATV().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("Bicicleta"))
		{
			categorias.getBicicleta().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("bicicleta_electrica"))
		{
			categorias.getBicicleta_electrica().put(placa, infoNuevoVehiculo);
		}
		else if (tipo.equals("patineta_electrica"))
		{
			categorias.getPatineta_electrica().put(placa, infoNuevoVehiculo);
		}
	}
	
}
