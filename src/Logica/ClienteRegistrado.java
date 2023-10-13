package Logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class ClienteRegistrado extends Persona
{
	private ArrayList<Reserva> infoReserva;
	private HashMap <Integer, ArrayList<Reserva>> reservas;
	private int reserva = 0;
	private Reserva nuevaReserva;

	private BaseDatos basedatos;

	private HashMap<String, List<String>> carrosEnUso;

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
		reservas = new HashMap<>();
		infoReserva = new ArrayList<>();
		
		

		carrosEnUso = new HashMap<>();
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

	//*************************************************************
	//Metodos Especificos
	//*************************************************************
	
	public void reservarVehiculo(String categoriaCarro, String sede, String fechaPickUp, String horaTurnIn, String sedeTurnIn)
	{
		
		this.nuevaReserva = new Reserva(categoriaCarro,sede,fechaPickUp,sedeTurnIn,horaTurnIn);
		
		HashMap<String, List<String>> sede1 = basedatos.getSede1();
		
		infoReserva.add(nuevaReserva);
		reservas.put(++reserva, infoReserva);
		System.out.println("Verificando condiciones del if...");


			if(sede.equals("sede1") && categoriaCarro.equals("suv")){
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede1.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede1.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(9).equals("suv")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			System.out.println("---------------------------------------------");
			System.out.println(carrosEnUso);
			System.out.println("-------------------------------------------------------------");
			System.out.println(reservas);
			
		}
}
