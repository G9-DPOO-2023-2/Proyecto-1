package Logica;

import java.util.ArrayList;
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
		this.basedatos = new BaseDatos();
		basedatos.cargarSede1("sede1.txt");
		basedatos.cargarSede2("sede2.txt");
		basedatos.cargarSede3("sede3.txt");
		
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
	
	public ArrayList<Reserva> getInfoReserva() {
		return infoReserva;
	}

	public void setInfoReserva(ArrayList<Reserva> infoReserva) {
		this.infoReserva = infoReserva;
	}

	public HashMap<Integer, ArrayList<Reserva>> getReservas() {
		return reservas;
	}

	public void setReservas(HashMap<Integer, ArrayList<Reserva>> reservas) {
		this.reservas = reservas;
	}

	public int getReserva() {
		return reserva;
	}

	public void setReserva(int reserva) {
		this.reserva = reserva;
	}

	public Reserva getNuevaReserva() {
		return nuevaReserva;
	}

	public void setNuevaReserva(Reserva nuevaReserva) {
		this.nuevaReserva = nuevaReserva;
	}

	public BaseDatos getBasedatos() {
		return basedatos;
	}

	public void setBasedatos(BaseDatos basedatos) {
		this.basedatos = basedatos;
	}

	public HashMap<String, List<String>> getCarrosEnUso() {
		return carrosEnUso;
	}

	public void setCarrosEnUso(HashMap<String, List<String>> carrosEnUso) {
		this.carrosEnUso = carrosEnUso;
	}

	//*************************************************************
	//Metodos Especificos
	//*************************************************************
	
	public void reservarVehiculo(String categoriaCarro, String sede, String fechaPickUp, String horaTurnIn, String sedeTurnIn)
	{
		
		this.nuevaReserva = new Reserva(categoriaCarro,sede,fechaPickUp,sedeTurnIn,horaTurnIn);
		
		HashMap<String, List<String>> sede1 = basedatos.getSede1();
		HashMap<String, List<String>> sede2 = basedatos.getSede2();
		HashMap<String, List<String>> sede3 = basedatos.getSede3();
		System.out.println(sede1.keySet().toString());
		System.out.println("--------------------------------------------");
		
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
					if (valorCarro.get(8).equals("suv")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede1") && categoriaCarro.equals("Deportivo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede1.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede1.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("Deportivo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede1") && categoriaCarro.equals("pequeño")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede1.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede1.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("pequeño")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede1") && categoriaCarro.equals("lujo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede1.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede1.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("lujo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede1") && categoriaCarro.equals("vans")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede1.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede1.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("vans")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			/**
			 * si es sede 2
			 */
			else if(sede.equals("sede2") && categoriaCarro.equals("suv")){
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede2.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede2.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("suv")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede2") && categoriaCarro.equals("Deportivo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede2.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede2.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("Deportivo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede2") && categoriaCarro.equals("pequeño")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede2.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede2.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("pequeño")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede2") && categoriaCarro.equals("lujo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede2.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede2.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("lujo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede2") && categoriaCarro.equals("vans")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede2.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede2.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("vans")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			/**
			 * si es sede 3
			 */
			
			else if(sede.equals("sede3") && categoriaCarro.equals("suv")){
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede3.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede3.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("suv")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede3") && categoriaCarro.equals("Deportivo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede3.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede3.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("Deportivo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede3") && categoriaCarro.equals("pequeño")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede3.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede3.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("pequeño")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede3") && categoriaCarro.equals("lujo")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede3.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede3.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("lujo")){
						llaveEs = llave;
						break;
					}
				}
				carrosEnUso.put(llaveEs, valorCarro);
				sede1.remove(llaveEs);
			}
			
			else if (sede.equals("sede3") && categoriaCarro.equals("vans")) 
			{
				System.out.println("Dentro del bloque IF!");

				Set<String> llaves = sede3.keySet();
				System.out.println(llaves);
				
				String llaveEs = null;
				List<String> valorCarro = null;

				for (String llave : llaves){
					valorCarro = sede3.get(llave);
					System.out.println(valorCarro);
					if (valorCarro.get(8).equals("vans")){
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
